package com.sov.anik.leetcode2;

import java.util.*;

import static java.lang.Math.min;

public class LongestPalindrome2131 {

    public static int longestPalindrome(String[] words) {

        boolean amountdp = false;
        int amountPair = 0;

        Map<String, Integer> map = new HashMap<>();

        Set<String> s = new HashSet<>();

        for(String w : words) {
            int k = map.getOrDefault(w, 0);
            map.put(w, k+1);
            s.add(w);
        }

        for(String w : map.keySet()) {
            int k = map.get(w);
            s.remove(w);
            for(String e : map.keySet()) {
                if (s.contains(e) && rev(w,e)) {
                    int l = map.get(e);
                    int pair = min(l,k);
                    amountPair += 2*pair;
                    s.remove(e);
                    continue;
                }
            }
            if (isdp(w)) {
                int r = k/2;
                amountPair += 2*r;
                if(k%2 == 1) {
                    amountdp = true;
                }
            }
        }

        if (amountdp) {
            amountPair++;
        }
        return 2*amountPair;
    }

    public static boolean rev(String s, String s2) {
        char [] c = s.toCharArray();
        char [] c2 = s2.toCharArray();
        if (c[1]==c2[0] && c[0]==c2[1]) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isdp(String s) {
        char [] c = s.toCharArray();
        if (c[0] == c[1]) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        String [] list = new String []{"dd","aa","bb","dd","aa","dd","bb","dd","aa","cc","bb","cc","dd","cc"};
        //String [] list = new String []{"lc","cl","gg"};
        //String [] list = new String []{"em","pe","mp","ee","pp","me","ep","em","em","me"};
        //String [] list = new String []{"cc","ll","xx"};
        System.out.println(longestPalindrome(list));
    }
}
