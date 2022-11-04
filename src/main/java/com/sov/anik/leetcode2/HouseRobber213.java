package com.sov.anik.leetcode2;
import java.util.Arrays;

import static java.lang.Math.max;

public class HouseRobber213 {

    public int rob(int[] nums) {
        int n = nums.length;
        if (n < 3) {
           return robNotRing(nums);
        }
        int a = robNotRing(Arrays.copyOfRange(nums, 0, n - 1));
        int b = robNotRing(Arrays.copyOfRange(nums, 1, n));
        return max(a,b);

    }

    public int robNotRing(int[] nums) {
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
