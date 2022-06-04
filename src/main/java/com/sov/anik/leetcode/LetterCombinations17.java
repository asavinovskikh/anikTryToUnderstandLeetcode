package com.sov.anik.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations17 {
    //https://leetcode.com/problems/letter-combinations-of-a-phone-number/
    String letters[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {
        String letters[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> result = new ArrayList<>();
        char [] a = digits.toCharArray();
        int [] a1 = new int[a.length];

        for(int i = 0; i < a.length; i++) {
            a1[i] = a[i]-'0';
        }

        return result;
    }

    public List<String> combination(String s1) {
        int number = s1.charAt(0) - '0';
        List<String> strings = new ArrayList<>();

        return strings;
    }
}
