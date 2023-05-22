package com.sov.anik.Leetcode4;

public class CountingPrefix {
    //https://leetcode.com/problems/counting-words-with-a-given-prefix/
    public static void main (String[] args) {

    }

    public int prefixCount(String[] words, String pref) {
        int amount = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(pref)) {
                amount++;
            }
        }
        return amount;
    }
}
