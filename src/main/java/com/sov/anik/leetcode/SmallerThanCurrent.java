package com.sov.anik.leetcode;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class SmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if (nums[i]< nums[j]){
                    result[j]+=1;
                }
                if (nums[i]> nums[j]){
                    result[i]+=1;
                }
            }
        }

        return result;
    }

}
