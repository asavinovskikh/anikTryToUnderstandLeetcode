package com.sov.anik.leetcode;

public class ClimbingStairs70 {

    //solution is ok but too slow!
    public static int climbStairs(int n) {
        if (n < 0 ) {
            return 0;
        }
        if (n < 2) {
            return 1;
        }
        int result = 0;
        result = climbStairs(n-1) + climbStairs(n-2);
        return result;
    }

    public static int climbStairsFast(int n) {

        if (n < 0 ) {
            return 0;
        }
        if (n < 2) {
            return 1;
        }
        int first = 0;
        int second = 1;
        int current = second;
        for(int i = 0; i < n; i++) {
            current = second + first;
            first = second;
            second = current;
        }
        return current;
    }

}
