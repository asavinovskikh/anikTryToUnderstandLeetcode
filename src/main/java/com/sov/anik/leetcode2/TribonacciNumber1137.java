package com.sov.anik.leetcode2;

public class TribonacciNumber1137 {

    public static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        int i = 0;
        if (n == 1 || n == 2) {
            return 1;
        }
        int ii = 1;
        return fiber(i,ii, ii + i, 2, n);
    }

    public static int fiber(int a, int b, int c, int i, int n) {
        if (i < n) {
            i++;
            return fiber(b, c, a+b+c ,i, n);
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(fib(4));
    }
}
