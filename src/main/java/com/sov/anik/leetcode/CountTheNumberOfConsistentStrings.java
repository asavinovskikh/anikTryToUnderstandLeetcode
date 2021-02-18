package com.sov.anik.leetcode;

//https://leetcode.com/problems/count-the-number-of-consistent-strings/
public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int amount = 0;
        char [] all = allowed.toCharArray();

        for (int i = 0; i < words.length; i++) {
            for(Character a : all) {
                words[i] = words[i].replaceAll(Character.toString(a), "");
            }
        }

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() == 0) {
                amount++;
            }
        }
        return amount;
    }

// not my
    public int countConsistentStrings2(String allowed, String[] words) {
        int total = 0;
        for(int i=0; i< words.length;i++){
            int count =0;
            for(int k=0;k<words[i].length();k++){
                if(allowed.contains(Character.toString(words[i].charAt(k)))){
                    count++;
                }
                if(count == words[i].length()){
                    total++;
                }
            }
        }
        return total;
    }

    public static void main(String[] args) {
        String allowed = "ab";
        String [] words = new String[] {"ad","bd","aaab","baa","badab"};
        CountTheNumberOfConsistentStrings arrr = new CountTheNumberOfConsistentStrings();
        System.out.println(arrr.countConsistentStrings(allowed, words));

    }
}
