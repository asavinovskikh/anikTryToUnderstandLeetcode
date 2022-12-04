package com.sov.anik.Leetcode3;


import java.util.*;

public class SortCharactersByFrequency451 {
    public static String frequencySort(String s) {
        List<Character>[] frequency = new List[s.length()+1];
        for(int i=0;i<=s.length();i++){
            frequency[i] = new ArrayList<Character>();
        }
        int[] freqMap = new int[256];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freqMap[ch]++;
        }
        for(int i=0;i<256;i++){
            if(freqMap[i]>0){
                frequency[freqMap[i]].add((char)(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=frequency.length-1;i>=1;i--){
            if(frequency[i].size()>0){
                for(char ch:frequency[i]){
                    for(int j=0;j<i;j++){
                        sb.append(ch);
                    }
                }
            }
        }
        // System.out.println(Arrays.toString(freqMap)+"|| "+ Arrays.toString(freq));
        return sb.toString();
    }


    public static String frequencySort0(String s) {
        int length = s.length();
        char[] a = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            int k  = map.getOrDefault(a[i], 0);
            map.put(a[i], k+1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);

        Map<Integer, Set<Character>> quant = new HashMap<>();
        map.keySet().stream().map(it ->
        {
            int k = map.get(it);
            quant.putIfAbsent(k, new HashSet<>(it));
            Set<Character> res = quant.getOrDefault(k, new HashSet<>());
            res.add(it);
            quant.put(k, res);
            return true;
        }).count();

        StringBuilder sb = new StringBuilder();
        Collections.reverse(list);

        for(Integer l : list) {
            Set<Character> res = quant.getOrDefault(l, new HashSet<>());
            for(Character ch : res) {
                for(int i = 0; i < l; i++) {
                    sb.append(ch);
                }
            }
            quant.put(l, new HashSet<>());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String result = "eert";
        String result2 = "eetr";
        String answer = frequencySort("tree");
        System.out.println(answer.equals(result) || answer.equals(result2));

        String q = "bbAa";
        String answer2 = frequencySort("Aabb");
        System.out.println(q.equals(answer2) || q.equals(answer2));
    }
}
