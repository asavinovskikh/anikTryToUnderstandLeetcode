package com.sov.anik.leetcode;

import java.util.ArrayList;
import java.util.List;

public class TheeSum {

        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            for(int i = 0; i < nums.length; i++) {
                result.add(threeCurrentSum(nums, i, nums[i]));
            }
            return result;
        }

        public List<Integer> threeCurrentSum(int[] nums, int i, int sum) {
            List<Integer> currentResult = new ArrayList<>();
            for (int j = 0; j < nums.length; j++) {
                TwoSum.getSumm()

            }
            return currentResult;
        }



    public static void main(String[] args) {

    }
}
