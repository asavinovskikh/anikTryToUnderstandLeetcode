package com.sov.anik.advent0fC0de;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SeventhElves {

    public static void main(String[] args) {
        SeventhElves s = new SeventhElves();
        try {
            s.calc();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void buildTree(List<String> currentLines) {

        Map<String, Integer> weight = new HashMap<>();
        Map<String, Integer> onlyDir = new HashMap<>();
        Map<String, String> childFindParent = new HashMap<>();
        Map<String, List<String>> tr = new HashMap<>();

        String currentDir = "/";

        for (String item : currentLines) {
            System.out.println(currentDir + " |" + item);
            if (item.startsWith("dir ")) {
                String k = item.replace("dir ", "");
                childFindParent.put(k, currentDir);
                onlyDir.put(k, 0);
                continue;
            }
            if (item.startsWith("$ cd /")){
                continue;
            }
            if (item.startsWith("$ cd ..")) {
                currentDir = childFindParent.get(currentDir);
                onlyDir.put(currentDir, 0);
                continue;
            }
            if (item.startsWith("$ cd ")) {
                String k = item.replace("$ cd ", "");
                childFindParent.putIfAbsent(k, currentDir);
                currentDir = k;
                continue;
            }
            //---//
            if (item.startsWith("$ ls")) {
                continue;
            }
            String s[] = item.trim().split(" ");
            childFindParent.put(s[1], currentDir);
            int kurWes = Integer.valueOf(s[0]);
            weight.put(s[1], kurWes);
        }
        Map<String, List<String>> mapParentChild = getParent(onlyDir, childFindParent);
        Set<String> resultPrep = onlyDir.keySet();
        while (!resultPrep.isEmpty()) {
            resultPrep = prepare(onlyDir, weight, childFindParent);
        }
        int resss = 0;
        for(String dir : onlyDir.keySet()) {
            if (onlyDir.get(dir) < 100000) {
                resss += onlyDir.get(dir);
            }
        }
        //int k = getTotalWeight(mapParentChild, weight, 100000);
        System.out.println("someResult" + resss);
        return;
    }

    private Set<String> prepare(Map<String, Integer> onlyDir, Map<String, Integer> weight, Map<String, String> childFindParent) {
        Set<String> notAdded = new HashSet<>();
        for(String child : childFindParent.keySet()) {
            int we = weight.getOrDefault(child, 0);
            String weParent = childFindParent.get(we);
            if (onlyDir.containsKey(weParent)) {
                int prevWeight = onlyDir.get(weParent);
                onlyDir.put(weParent, prevWeight + we);
            } else {
                notAdded.add(weParent);
            }
        }
        return notAdded;
    }

    private int getTotalWeight(Map<String, List<String>> mapParentChild, Map<String, Integer> weight, int k) {
        int res = 0;
        for(String s : mapParentChild.keySet()) {
            int resultOne = getOne(s, mapParentChild, weight);
            if (resultOne < k) {
                res += resultOne;
            }
        }
        return res;

    }

    private int getOne(String s, Map<String, List<String>> mapParentChild, Map<String, Integer> weight) {
        int currentResult = 0;
        for(String child : mapParentChild.get(s)) {
            if (weight.containsKey(child)) {
                currentResult += weight.get(child);
            } else {
                currentResult += getOne(child, mapParentChild, weight);
            }
        }
        return currentResult;
    }


    private Map<String, List<String>> getParent(Map<String, Integer> only, Map<String, String> childfindParent) {
        int total = 0;
        Map<String, List<String>> result = new HashMap<>();

        for(String s : only.keySet()){
            List<String> listChild = new ArrayList<>();
            for(String namechild : childfindParent.keySet()) {
                if (s.equals(childfindParent.get(namechild))) {
                    listChild.add(namechild);
                }
            }
            result.put(s, listChild);
        }

        return result;
    }

//    private void getTotalWeight(Map<String, Integer> only, Map<String, String> childfindParent) {
//        int total = 0;
//        for(String s : only.keySet()){
//            List<String> listC = new ArrayList<>();
//            List<String> listChild = getWeight(s, childfindParent, weight, listC);
//            int k = 0;
//            for(String namechild : listChild) {
//                k += weight.get(namechild);
//            }
//            only.put(s, k);
//        }
//
//        for(String s : only.keySet()) {
//            int additional = only.get(s);
//            if (additional > 0 && additional <= i) {
//                System.out.println("plus " + additional);
//                total += additional;
//            }
//        }
//        //95437 test
//        //460794 too lower
//        System.out.println("this" + total);
//    }
//
//    private List<String> getWeight(String s, Map<String, String> childfindParent, Map<String, Integer> weight) {
//        int totalSumForOne = 0;
//        List<String> childList = new ArrayList<>();
//        for(String child : childfindParent.keySet()) {
//            if (childfindParent.get(child).equals(s)) {
//                //
//                childList.add(child);
//                if (weight.containsKey(child)){
//                    totalSumForOne += weight.get(child);
//                } else{
//                    totalSumForOne += getWeight(child, childfindParent, weight, new ArrayList<String>);
//                }
//            }
//        }
//        return childList;
//        //return totalSumForOne;
//    }


    public int calc() throws IOException {
        List<String> str = new ArrayList<>();
        int max = 0;

        BufferedReader reader = new BufferedReader(new FileReader("D:\\Kaggle\\input70.txt"));

        String currentLine = null;
        int summ = 0;

        while ((currentLine = reader.readLine()) != null) {
            currentLine.trim();
            str.add(currentLine);
        }

        reader.close();
        buildTree(str);
        System.out.println(summ);
        return summ;
    }

}
