package com.sov.anik.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation784 {
    public static List<String> letterCasePermutation(String s) {

        List<String> result = new ArrayList<>();
        if (s.isEmpty()) {
            result.add("");
            return result;
        }
            List<String> previous = letterCasePermutation(s.substring(1));
            char a = s.charAt(0);
            if (Character.isDigit(a)) {
                result = concat(a, previous) ;
            } else {
                result = concat(Character.toUpperCase(a), previous);
                result.addAll(concat(Character.toLowerCase(a), previous));
            }
            return result;
        }

    public static List<String> concat(char elem, List<String> all) {
        List<String> result = new ArrayList<>();
        for(String st : all) {
            result.add(elem+st);
        }
        return result;
    }

}
