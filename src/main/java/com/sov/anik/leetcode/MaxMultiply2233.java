package com.sov.anik.leetcode;

import java.util.PriorityQueue;

public class MaxMultiply2233 {
    public static int maximumProduct(int[] nums, int k) {

        PriorityQueue<Integer> mult = new PriorityQueue<Integer>();
        for(int i = 0; i < nums.length; i++) {
            mult.offer(nums[i]);
        }

        while (k > 0) {
            mult.add(mult.poll()+ 1);
            k--;
        }

        long longb = 1000000007;
        long longResult = 1;
        while (!mult.isEmpty()) {
            longResult = (longResult * mult.poll()%longb);
        }
        return (int) longResult;
    }
}
