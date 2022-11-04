package com.sov.anik.leetcode2;

import java.util.*;

public class ReverseWovels341 {

    public static String reverseVowels(String s) {
        char[] c = s.toCharArray();
        Stack<Character> a = new Stack<>();
        for(char c1 : c) {
            if (isWovel(c1)) {
                a.push(c1);
            }
        }
        for(int i = 0; i < c.length; i++) {
            if (isWovel(c[i])) {
                char f = a.pop();
                c[i] = f;
            }
        }
        return new String(c);

    }

    public static boolean isWovel(char c) {
        char a = Character.toLowerCase(c);
        if (a == 'a' || a == 'o' || a == 'i' || a == 'u' || a == 'e') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("Aa"));
    }
}
