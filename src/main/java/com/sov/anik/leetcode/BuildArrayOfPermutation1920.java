package com.sov.anik.leetcode;

import java.util.HashMap;
import java.util.Map;

public class BuildArrayOfPermutation1920 {

    public int[] buildOldButOkArray(int[] nums) {
        Map<Integer, Integer> result = new HashMap();
        for(int i = 0; i < nums.length; i++) {
            result.put(i, nums[nums[i]]);
        }
        for(int i = 0; i < nums.length; i++) {
            nums[i] = result.get(i);
        }

        return nums;
    }

    public int[] buildArray(int[] nums) {
        int [] ams = new int [nums.length];
        for(int i = 0; i < nums.length; i++) {
            ams[i] = nums[nums[i]];
        }
        return ams;
    }
}
