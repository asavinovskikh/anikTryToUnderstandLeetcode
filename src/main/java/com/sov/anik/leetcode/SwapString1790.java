package com.sov.anik.leetcode;

public class SwapString1790 {
    public boolean areAlmostEqual(String s1, String s2) {
        int[] fich = new int[26];
        for(char a : s1.toCharArray() ) {
            fich[a-'a']++;
        }
        for(char b : s2.toCharArray() ) {
            fich[b-'a']--;
        }
        for(int i = 0; i < 26; i++) {
            if (fich[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public char findTheDifference(String s, String t) {
        for(char ch : s.toCharArray()) {
            t.replace(ch, ' ');

        };
        return  t.trim().toCharArray()[0];
    }
}
