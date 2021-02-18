package com.sov.anik.leetcode;

//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class ArrayStringsAreEqual {


    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder anew = new StringBuilder();
        for (int i = 0 ; i < word1.length; i++) {
            anew.append(word1[i]);
        }

        StringBuilder bnew = new StringBuilder();
        for (int i = 0 ; i < word2.length; i++) {
            bnew.append(word2[i]);
        }

        return anew.toString().compareTo(bnew.toString()) == 0;
    }


    public static void main(String[] args) {
        String [] a = new String [] {"ab", "c"};
        String [] b = new String [] {"a", "bc"};

        ArrayStringsAreEqual aarrr = new ArrayStringsAreEqual();

        System.out.println(aarrr.arrayStringsAreEqual(a,b));
    }


}
