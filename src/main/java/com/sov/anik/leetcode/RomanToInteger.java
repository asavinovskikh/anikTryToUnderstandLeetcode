package com.sov.anik.leetcode;


import java.util.HashMap;

//https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {

    static HashMap<String, Integer> data = new HashMap() {{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};

    public int romanToInt(String s) {
        int result = 0;
        char[] a = s.toCharArray();
        int i = 0;
        while (i  + 1 < a.length ) {
            if (data.get(String.valueOf(a[i])) < data.get(String.valueOf(a[i + 1]))) {
                result -= data.get(String.valueOf(a[i]));
            } else {
                result += data.get(String.valueOf(a[i]));
            }
             i++;
        }
        result += data.get(String.valueOf(a[i]));
        return result;
    }


    public static void main(String[] args) {

        String first = "III";
        String second = "IX";
        String third = "LVIII";
        RomanToInteger rr = new RomanToInteger();

        //System.out.println(rr.romanToInt(first));
        //System.out.println(rr.romanToInt(second));
        System.out.println(rr.romanToInt(third));

    }

}
