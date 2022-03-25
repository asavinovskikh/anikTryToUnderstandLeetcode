package com.sov.anik.leetcode;

import java.util.Arrays;

import static java.lang.Math.max;

public class RobberStrategy198 {

        public static int rob(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }

            int length = nums.length;
            if (length == 1) {
                return nums[0];
            }
            if (length == 2) {
                return max(nums[0], nums[1]);
            }
            if (length == 3) {
                return max(nums[0] + nums[2], nums[1]);
            }

            if (length == 4) {
                return max(nums[0] + nums[3], max(nums[0] + nums[2], nums[1] + nums[3]));
            }

            //1
            //return max(nums[0] + rob(Arrays.copyOfRange(nums, 2, length)), rob(Arrays.copyOfRange(nums, 1, length)));

            //2
            int l3 = rob(Arrays.copyOfRange(nums, 3, length));
            int l4 = rob(Arrays.copyOfRange(nums, 4, length));
            return max(nums[0] + max(l3, nums[2] + l4), max(nums[1] + l3, nums[2] + l4));
        }

    public static int robFirst(int[] nums) {
        int length = nums.length;

        if (length < 1) {
            return 0;
        }
        int twoHouses  = nums[0];
        if (length == 1) {
            return twoHouses;
        }
        int oneHouses = max(nums[0], nums[1]);
        if (length == 2) {
            return oneHouses;
        }
        for(int i = 2; i < nums.length; i++) {
            int temp = oneHouses;
            oneHouses = max(nums[i]  + twoHouses, temp);
            twoHouses = temp;
        }
        return max(oneHouses, twoHouses);
    }

}
