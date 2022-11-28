package com.sov.anik.Leetcode3;

public class EndOfLastWord58 {
    public static int lengthOfLastWord(String s) {
        String[] las = s.split(" ");
        return las[las.length-1].length();
    }

    public static void main(String[] args) {
        String a = new String("   fly me   to   the moon  ");
        System.out.println(lengthOfLastWord(a));
    }
}
