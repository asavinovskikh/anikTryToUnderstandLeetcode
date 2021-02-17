package com.sov.anik.leetcode;

//https://leetcode.com/problems/shuffle-the-array/
public class ShuffleTheArray {


    public int[] shuffle(int[] nums, int n) {
        int [] a = new int [nums.length];
        for (int i = 0; i < n; i++) {
            a[2*i] = nums[i];
            a[2*i+1] = nums[n + i];
        }

        return a;
    }

}
