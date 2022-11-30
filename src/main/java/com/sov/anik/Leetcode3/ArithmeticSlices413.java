package com.sov.anik.Leetcode3;

import java.util.HashSet;
import java.util.Set;

public class ArithmeticSlices413 {
    public static int numberOfArithmeticSlices(int[] nums) {
        int result = 0;
        Set<Integer> unique = new HashSet();
        for(int i = 0; i < nums.length; i++) {
            unique.add(nums[i]);
        }
        int size = unique.size() - 3;
        if (size < 0) {
            return 0;
        }



        return result;
    }

    public static void main(String[] args) {
        int [] nums = new int [] {};
        numberOfArithmeticSlices(nums);
    }
}
