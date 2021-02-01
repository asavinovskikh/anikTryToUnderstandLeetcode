package com.sov.anik.leetcode;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {

    public boolean isValid(String s) {
        int lentgh = s.length();
        int it = 0;
        char[] a = s.toCharArray();
        Stack<Integer> stack = new Stack<>();

        while (it < lentgh) {

            if (a[it] == '{') {
                stack.push(1);
                it++;
                continue;
            }
            if (a[it] == '[') {
                stack.push(2);
                it++;
                continue;
            }
            if (a[it] == '(') {
                stack.push(3);
                it++;
                continue;
            }

            if (!stack.empty()) {
                if (a[it] == '}') {
                    if (stack.pop() != 1) {
                        return false;
                    }
                    it++;
                    continue;
                }

                if (a[it] == ']') {
                    if (stack.pop() != 2) {
                        return false;
                    }
                    it++;
                    continue;
                }

                if (a[it] == ')') {
                    if (stack.pop() != 3) {
                        return false;
                    }
                    it++;
                    continue;
                }
            } else {
                return false;
            }
            it++;
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        String first = "([)]";
        System.out.println(vp.isValid(first));
        String second = "{[]}";
        System.out.println(vp.isValid(second));
    }
}
