package com.sov.anik.leetcode2;

public class JumpGame55 {
    public static boolean canJump(int[] nums) {
        int max = 0;
        int n = nums.length;

        for(int i = 0; i < n; i++) {
            if (max < i) {
                return false;
            }
            max = Math.max(nums[i] + i, max);
        }
        return true;
    }
    //and 45
    public static int canJumpII(int[] nums) {
        int jumps = 0;
        int max = 0;
        int currMax = 0;
        int n = nums.length;

        for (int i = 0; i < n-1; i++) {
            max = Math.max(max, i + nums[i]);
            if (i == currMax) {
                jumps++;
                currMax = max;
            }

        }
        return jumps;
    }

    public static void main(String[] args) {
        //int [] a = new int []{2,3,1,1,4};
        int [] a = new int []{2,3,1,1,4};
        System.out.println(canJumpII(a));
    }


}
