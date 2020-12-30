package com.sov.anik.leetcode;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class TwoSum2 {
        public int[] twoSum2(int[] nums, int target) {
            int[] a = new int [2];
            int size = nums.length;

            int i =0;
            int j = size-1;
            while(i < j) {
                    int c = nums[i] + nums[j];
                    if (nums[i] + nums[j] == target) {
                        a[0] = i + 1;
                        a[1] = j + 1;
                        return a;
//                 return new int[]{left+1, right+1};
                    }
                    if (nums[i] + nums[j]  < target) {
                        i++;
                    }else {
                        j--;
                    }
            }
            a[0] = i + 1;
            a[1] = j + 1;
            return a;
        }


        public static void main(String[] args) {
            //int[] c = new int []{2,7,11,15};
            //int target = 9;

            //int[] c = new int []{3,2,4};
            //int target = 6;

            int[] c = new int []{2,3,4};
            int target = 6;

            int[] result = new int [2];
            TwoSum2 tw = new TwoSum2();

            result = tw.twoSum2(c,target);
            return;
        }

    }

