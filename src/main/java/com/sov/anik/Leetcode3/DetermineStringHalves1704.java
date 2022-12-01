package com.sov.anik.Leetcode3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DetermineStringHalves1704 {

    public static boolean halvesAreAlike(String s) {
        List<Character> listVowels = new ArrayList(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int n = s.length();
        int half = n/2;
        char[] a = s.toCharArray();
        int left = 0;
        int right = 0;
        for(int i = 0; i < n; i++) {
            if (listVowels.contains(a[i])) {
                if (i < half) {
                    left++;
                } else {
                    right++;
                }
            }
        }
        System.out.println(left + " " + right);
        return(left == right);

    }


    public static void main(String[] args) {

        halvesAreAlike("helloKitty");
        halvesAreAlike("textbook");


    }
}
