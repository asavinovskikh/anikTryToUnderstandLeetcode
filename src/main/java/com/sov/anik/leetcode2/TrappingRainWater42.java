package com.sov.anik.leetcode2;

public class TrappingRainWater42 {
    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int n = height.length;

        int left = 0;
        int maxLeft = 0;
        int right = n - 1;
        int maxRight = 0;

        int totalSum = 0;

        while(left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= maxLeft) {
                    maxLeft = height[left];
                } else {
                    totalSum += maxLeft - height[left];
                }
                left++;
            } else {
                if (height[right] >= maxRight) {
                    maxRight = height[right];
                } else {
                    totalSum += maxRight - height[right];
                }
                right--;
            }
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int [] a = new int []{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(a));
    }

}
