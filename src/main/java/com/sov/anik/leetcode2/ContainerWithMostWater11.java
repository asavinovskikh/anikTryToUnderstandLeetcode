package com.sov.anik.leetcode2;

import static java.lang.Math.min;

public class ContainerWithMostWater11 {
    public static int maxArea(int[] height) {
        int n = height.length;
        int i = 0; int j = n-1;
        int maxWater = 0;
        int currWater = 0;

        while(i < j) {
            int m = min(height[i], height[j]);
            currWater = m * (j - i);
            if (maxWater < currWater) {
                maxWater = currWater;
            }
            if (height[i] < height[j]) {
                i++;
            } else {j--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(a));
    }
}
