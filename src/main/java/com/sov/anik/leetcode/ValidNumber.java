package com.sov.anik.leetcode;

import java.util.Arrays;
import java.util.regex.Pattern;

//https://leetcode.com/problems/valid-number/
public class ValidNumber {

    //"0" => true
    //" 0.1 " => true
    //"abc" => false
    //"1 a" => false
    //"2e10" => true
    //" -90e3   " => true
    //" 1e" => false
    //"e3" => false
    //" 6e-1" => true
    //" 99e2.5 " => false
    //"53.5e93" => true
    //" --6 " => false
    //"-+3" => false
    //"95a54e53" => false




    public static int count(String str, String target) {
        return (str.length() - str.replace(target, "").length()) / target.length();
    }

    //(\+\-)?[^a-d,f-z](?=\.|\d)(?=e|\d)

    //Знак?число*точка?Число*е?знак?число
    public boolean isMatchFirst(String dot) {
            return dot.matches("(\\+|-)?\\d+\\.\\d*e(\\+|-)?\\d+") ||
                    dot.matches("(\\+|-)?\\d*\\.\\d+e(\\+|-)?\\d+");
    }

    public boolean isMatchSecond(String dot) {
        return dot.matches("(\\+|-)?\\d+\\.?\\d*") ||
               dot.matches("(\\+|-)?\\d*\\.\\d+");
    }

    public boolean isMatchThird(String dot) {
        return dot.matches("(\\+|-)?\\d+e(\\+|-)?\\d+");
    }


    public boolean isNumber(String s) {
        if (s == null || s.isEmpty() ) {
            return false;
        }

        String n = s.trim();

        if (isMatchFirst(n) || isMatchSecond(n) || isMatchThird(n)) {
            return true;
        } else {
            return false;
        }

        //Знак?число*точка?Число*е?знак?число
        //
        //Знак?число?точка?число
        //
        //Знак?Число?е знак?Число

    }



    public boolean isNumber2(String s) {
        if (s == null || s.isEmpty() ) {
            return false;
        }

        String n = s.trim();

        //(\+\-)?[^a-d,f-z](?=\.|\d)(?=e|\d)
        Pattern pattern = Pattern.compile("(\\+|-)?\\d+e(\\+|-)?\\d+");
        if (
                s.replace(".", "")
                        .replace("e", "")
                        .replace("-", "2")
                        .replace("+", "3")
                        .trim()
                        .matches("(\\+|\\-)?\\d+") &&
                count(n, ".")<2 &&
                count(n, "e")<2 &&
                !n.startsWith("e") &&
                !n.endsWith("e")
                && ((n.indexOf(".") + 1) < n.indexOf("e") || !n.contains("e"))
        ) {
            String[] d = n.split("[.e]");
            return Arrays.stream(d).filter(x -> !x.isEmpty()).allMatch(x ->x.matches("(\\+|\\-)?\\d+"));

        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        String[] a = {".e1", " 0.1 ", "abc", "1 a", "2e10",
                " -90e3   ", " 1e", "e3", " 6e-1", " 99e2.5 ",
                "53.5e93", " --6 ", "-+3", "95a54e53"};
        int [] result = {0,1,0,0,1,1,0,0,1,0,1,0,0,0};
        ValidNumber d = new ValidNumber();

        for(int j = 0; j<14; j++) {
            if (d.isNumber(a[j]) == (result[j]==1)) {
                System.out.print("TRUE ");
            } else {
                System.out.print("FALSE ");
            };
            System.out.println(a[j]);
        }
        //Arrays.stream(a).map(x -> isNumber(x));
    }
}
