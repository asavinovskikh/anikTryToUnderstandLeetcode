package com.sov.anik.leetcode;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/integer-to-roman/
public class IntegerToRoman {

    Map<Integer, String> myRomeMap = new HashMap<Integer, String>() {{
        put(1,"I");
        put(5, "V");
        put(10, "X");
        put(50, "L");
        put(100, "C");
        put(500, "D");
        put(1000, "M");
    }};

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        //result.append(numberToWords(num));
        return numberToWords(num);
        //return result.toString();
    }

    public String numberToWords(int num) {
        String result = returnTen(num).trim();
        System.out.println(result);
        return result;
    }


    //8 = VIII
    //9 = IX
    String returnTen(int number) {
        return "";
    };


    public static void main(String[] args) {
        NumberToWords numberToWords = new NumberToWords();
        int i = 123;
        //for(int i = 100; i < 201; i++) {

        System.out.println(" " + i + "     " + numberToWords.returnTen(i));
        //}

    }




}
