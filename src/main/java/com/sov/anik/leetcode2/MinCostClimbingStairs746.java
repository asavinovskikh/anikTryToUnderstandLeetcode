package com.sov.anik.leetcode2;

import java.util.HashMap;

import static java.lang.Math.min;

public class MinCostClimbingStairs746 {
    public static int minCostClimbingStairs(int[] cost) {

        int len = cost.length;
        int [] minCost = new int[len];



        if (len == 1) {
            return cost[0];
        }
        if (len == 2) {
            return min(cost[0], cost[1]);
        }


        minCost[len-1] = cost[len-1];
        minCost[len-2] = cost[len-2];

        for(int i = len-3; i >= 0; i--) {
            minCost[i] = cost[i] + min(minCost[i+1], minCost[i+2]);
        }

        return min(minCost[0], minCost[1]);
    }


    public static void main(String[] args) {
        int [] a = new int[]{10,15,20};
        System.out.println(minCostClimbingStairs(a));
    }

}
