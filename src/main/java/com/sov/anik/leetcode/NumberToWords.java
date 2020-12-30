package com.sov.anik.leetcode;


//https://leetcode.com/problems/integer-to-english-words/

import java.util.HashMap;
import java.util.Map;

public class NumberToWords {

    Map<Integer, String> myBeforeHundredMap = new HashMap<Integer, String>() {{
        put(20,"Twenty");
        put(30, "Thirty");
        put(40, "Forty");
        put(50, "Fifty");
        put(60, "Sixty");
        put(70, "Seventy");
        put(80, "Eighty");
        put(90, "Ninety");
    }};

    Map<Integer, String> myBeforeTwentyMap = new HashMap<Integer, String>() {{
        put(13, "Thirteen");
        put(14, "Fourteen");
        put(15, "Fifteen");
        put(16, "Sixteen");
        put(17, "Seventeen");
        put(18, "Eighteen");
        put(19, "Nineteen");
    }};

    Map<Integer, String> myOnesMap = new HashMap<Integer, String>() {{
        put(0,"Zero");
        put(1,"One");
        put(2,"Two");
        put(3, "Three");
        put(4, "Four");
        put(5, "Five");
        put(6, "Six");
        put(7, "Seven");
        put(8, "Eight");
        put(9, "Nine");
        put(10, "Ten");
        put(11, "Eleven");
        put(12, "Twelve");
    }};

    public String numberToWords(int num) {
        String result = returnTen(num).trim();
        System.out.println(result);
        return result;
    }

    String returnTen(int number) {
        if (number < 13) {
            return myOnesMap.get(number) + " ";
        }

        if (number < 20) {
            int c = number % 10;
            return myBeforeTwentyMap.get(number) + " ";
        }

        if (number < 100) {
            int c = number / 10;
            int d = number % 10;
            return myBeforeHundredMap.get(c*10) + " " + (d!= 0 ?myOnesMap.get(d) + " " : "");
        }

        if (number < 1_000) {
            int c = number / 100;
            int d = number % 100;
            return returnTen(c) + "Hundred " + (d!= 0 ? returnTen(d) : "");
        }

        if (number < 1_000_000) {
            int c = number / 1_000;
            int d = number % 1_000;
            return returnTen(c) + "Thousand " + (d!= 0 ? returnTen(d) : "");
        }

        if (number < 1_000_000_000) {
            int c = number / 1_000_000;
            int d = number % 1_000_000;
            return returnTen(c) + "Million " + (d!= 0 ? returnTen(d) : "");
        }

        int c = number / 1_000_000_000;
        int d = number % 1_000_000_000;
        return returnTen(c) + "Billion " + (d!= 0 ? returnTen(d) : "");
    };


    //A block
    //0-12 - myOnesMap
    //13-19 - 3*10 +replace "ty", "teen"
    //20-99 - myBeforeHundred + skip zero myOnesMap
    //B block
    //100-999 - (1Ablock + HUNDRED + Ablock(num % 100))

    //C block
    //1000-999999 AB block(num/1000) thousand  + AB block(num%1000)

    public static void main(String[] args) {
        NumberToWords numberToWords = new NumberToWords();
        int i = 123;
        //for(int i = 100; i < 201; i++) {

            System.out.println(" " + i + "     " + numberToWords.returnTen(i));
        //}

    }



}




