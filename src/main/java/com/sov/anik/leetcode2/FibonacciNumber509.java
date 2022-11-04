package com.sov.anik.leetcode2;

public class FibonacciNumber509 {

    public static int fib(int n) {
        int i = 1;
        int ii = 1;
        return fiber(i,ii, 2, n);
    }

    public static int fiber(int a, int b, int i, int n) {
        if (i < n) {
            i++;
            return fiber(b, a+b, i, n);
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
