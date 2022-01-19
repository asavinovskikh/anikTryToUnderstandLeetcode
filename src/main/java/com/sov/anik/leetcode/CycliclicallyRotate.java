package com.sov.anik.leetcode;

import java.util.HashMap;
import java.util.Map;

public class CycliclicallyRotate {

    //Given an array, cyclically rotate the array clockwise by one.
    //  Examples:
    //    Input:  arr[] = {1, 2, 3, 4, 5}
    //    Output: arr[] = {5, 1, 2, 3, 4}

    public static void main(String[] args) {
//        int arr[] = {1, 2};
//        //int arr [] = {1, 2, 3, 4, 5};
//
//        int[] result = rotate(arr);
//
//        if (result != null) {
//            for (int in = 0; in < result.length; in++) {
//                System.out.println(result[in] + " ");
//            }
//        }
        //String input = new String("ahabcjahbdcjbjj");
        String input = new String("a,c$db$ef");

        String output = rotate(input);
        System.out.println(output);
        //codify the input string ( ahabcjahbdcjbjj )  as   (a3b3c2dh2j4 )
        //(aaabbbcccdha) -> (a3b3c3dha)


    }

    private static String calculation(String input) {
        if (input == null || input.length() == 0) {
            return null;
        }

        Map<String, Integer> mymap = new HashMap<>();

        int size = input.length();
        char[] myArray = input.toCharArray();

        for(int ind = 0; ind < size; ind ++) {
            Integer value = mymap.get(String.valueOf(myArray[ind]));
            if (value == null) {
                mymap.put(String.valueOf(myArray[ind]), 1);
            } else {
                mymap.put(String.valueOf(myArray[ind]), value + 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String element : mymap.keySet()) {

            sb.append(element);
            if (mymap.get(element) > 1) {
                sb.append(mymap.get(element));
            }
        }
        return sb.toString();

    }

    static String rotate(String input) {

        char prev;
        boolean findFirst = false;

        char [] inp = input.toCharArray();

        int ind = input.length()-1;
        int find = 0;

        while (find < ind) {
            if (Character.isAlphabetic(inp[ind])) {
                if (Character.isAlphabetic(inp[find])) {
                    char value = inp[ind];
                    inp[ind] = inp[find];
                    inp[find] = value;
                    find ++;
                    ind --;
                }else {find++;}
            }else {ind --;}
        }
        return new String (inp);
    }


}
