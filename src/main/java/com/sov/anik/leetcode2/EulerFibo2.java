package com.sov.anik.leetcode2;

public class EulerFibo2 {

    public static void getSmth(){
        int start = 1;
        int prev = 0;
        int max = 4000000;
        long sum = 0;
        int curr = 0;

        while (curr < max) {
            curr = getNext(prev, start);
            if (curr % 2 == 0) {
                sum += curr;
            }
            prev = start;
            start = curr;
        }
        System.out.println(sum);
    }

    public static int getNext(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        getSmth();
    }
}
