package com.sov.anik.leetcode2;

import java.util.Stack;

public class MakeGood1544 {
    public static String makeGood(String s) {
        char l [] = s.toCharArray();
        int n = l.length;
        if (n < 2) {
            return s;
        }
        int first = 0;
        int second = 1;

        Stack<Character> a = new Stack();
        a.push(l[0]);

        for(int i = 1; i < n; i++){
            char curr = l[i];
                char prev = a.pop();
                if(Character.isUpperCase(curr) && Character.isLowerCase(prev) ||
                        Character.isLowerCase(curr) && Character.isUpperCase(prev)) {
                    System.out.println(prev + " " + curr);
                } else {
                    a.push(prev);
                }
                 a.push(curr);
        }

        StringBuilder sb = new StringBuilder();
        while(!a.empty()) {
            sb.append(a.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        //String s = "aAbBcC";
        String s = "leEeetcode";
        System.out.println(makeGood("s"));
        System.out.println(makeGood(s));
    }

}
