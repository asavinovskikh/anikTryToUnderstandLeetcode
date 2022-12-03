package com.sov.anik.Leetcode3;

import java.util.*;

public class CloseStrings1657 {

    public static boolean closeStrings(String word1, String word2) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();
        if (w1.length != w2.length) {
            return false;
        }

        for(int i = 0; i < w1.length; i++) {
            int k  = map.getOrDefault(w1[i], 0);
            map.put(w1[i], k+1);

            int e  = map2.getOrDefault(w2[i], 0);
            map2.put(w2[i], e+1);
        }

        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list);
        List<Integer> list2 = new ArrayList<>(map2.values());
        Collections.sort(list2);
        for(int i = 0; i < list.size(); i++) {
            if (list.get(i) != list2.get(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        boolean res = closeStrings("abc", "bca");
//        boolean res = closeStrings("cabbba", "aabbss");
        boolean res = closeStrings("uau", "ssx");
        System.out.println(res);
    }
}
