package com.sov.anik.Leetcode4;

public class ValidAnagramm {

    public static void main (String[] args) {
        //System.out.println(isAnagram("coffee", "ffeeco"));
        System.out.println(isAnagram("bat", "car"));
    }

    public static boolean isAnagram(String s, String t) {
        int[] a = new int[26];
        for(char k : s.toCharArray()) {
            int ind = k-97;
            a[ind] = a[ind]+1;
        }
        for(char r : t.toCharArray()) {
            int index = r-97;
            a[index] = a[index]-1;
        }

        for(int aa : a) {
            if(aa != 0) {
                return false;
            }
        }
        return true;
    }

}
