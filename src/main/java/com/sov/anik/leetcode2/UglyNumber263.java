package com.sov.anik.leetcode2;

public class UglyNumber263 {

    public static boolean isUgly(int n) {

        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        while(n %2 ==0) {
            n = n>>1;
        }
        while(n %3 ==0) {
            n = n / 3;
        }
        while(n %5 ==0) {
            n = n / 5;
        }
        return n==1;
    }


    public static void main(String[] args) {
        System.out.println(isUgly(14));
        System.out.println(isUgly(6));
    }
}
