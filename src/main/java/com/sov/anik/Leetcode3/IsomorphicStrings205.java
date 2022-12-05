package com.sov.anik.Leetcode3;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings205 {

    public static boolean isIsomorphic(String s, String t) {
        boolean isIsomorphic = true;
        char [] a = s.toCharArray();
        char [] b = t.toCharArray();
        if (a.length != b.length) {
            return false;
        }
        Map<Character, Character> back = new HashMap<>();
        for(int i = 0; i < a.length; i++) {
            if (a[i] !=b[i]) {
                if (back.containsKey(a[i])) {
                    if (b[i] != back.get(a[i])) {
                        isIsomorphic = false;
                    } else {
                        isIsomorphic = true;
                    }
                } else {
                    back.put(a[i], b[i]);
                }
            }
        }
        return isIsomorphic;
    }

    public static void main(String[] args) {
//        System.out.println(isIsomorphic("bee", "woo")); //true
//        System.out.println(isIsomorphic("agg", "add")); //true
//        System.out.println(isIsomorphic("foo", "bar")); //false
//        System.out.println(isIsomorphic("paper", "title")); //true
        System.out.println(isIsomorphic("badc", "baba")); //false
    }
}
