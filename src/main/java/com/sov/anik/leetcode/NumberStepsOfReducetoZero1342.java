package com.sov.anik.leetcode;

public class NumberStepsOfReducetoZero1342 {
    public int numberOfSteps(int num) {
        int n = 0;
        if (num == 0) {
            return 0;
        }
        else {
            while (num > 0) {
                n++;
                if (num%2 == 0) {
                    num /=2;
                } else {
                    num -=1;
                }
            }
            return n;
        }

    }
}
