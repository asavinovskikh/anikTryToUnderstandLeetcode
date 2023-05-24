package com.sov.anik.Leetcode4;

import com.sov.anik.leetcode.Utils;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubsequenceScore {

    public static void main (String[] args) {
        MaximumSubsequenceScore mm = new MaximumSubsequenceScore();
        int [] a = new int []{1,3,3,2};
        int [] b = new int []{2,1,3,4};
        int k = 3;
        System.out.println(mm.maxScore(a,b,k));
    }

    //https://leetcode.com/problems/maximum-subsequence-score/
    //сумму из подмножества первых * минимум из подмножества вторых - найти максимальный из таких результатов
    //подмножество длины K
    public long maxScore(int[] nums1, int[] nums2, int k) {
        List<int[]> all = new ArrayList <>();
        int len = nums1.length;
        int [] num = new int [len];
        all = getIndices(all, num, 0, k);
        for(int [] one : all) {
            Utils.printArray(one);
        }

        long max = 0;
        for (int [] one : all) {
            long middle = calculate(nums1, nums2, one);
            if (middle < max) {
                max = middle;
            }
        }
        return max;
    }

    public long calculate(int[] nums1, int[]nums2, int [] actual) {
        long sum = 0;
        long min = 0;
        for(int i = 0; i < nums1.length; i++) {
            if (actual[i] == 1) {
                sum += nums1[i];
                if (min > nums2[i]) {
                    min = nums2[i];
                }
            }
        }
        System.out.println("sum " + sum + " min " + min);
        return sum * min;
    }

    public List <int[]> getIndices(List <int[]> numAll, int [] nums, int i, int k) {
        if (k == 0) {
            numAll.add(nums);
            return numAll;
        }
        if (i == nums.length-1) {
            return numAll;
        }
        if (k > 0) {
            nums[i] = 1;
            getIndices(numAll, nums, i+1, k - 1);
        }
        nums[i] = 0;
        getIndices(numAll, nums, i+1, k);

        return numAll;
    }


}

