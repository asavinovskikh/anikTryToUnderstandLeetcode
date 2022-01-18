package com.sov.anik.leetcode;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int size = nums.length;
        int i = size / 2;
        int currentDelta = i;
        if (nums[0] > target) {
            return 0;
        }
        if (nums[size-1] < target) {
            return size;
        }
        do {
            if (nums[i] == target) {
                return i;
            }
            if (i+1 < size  && nums[i+1] == target) {
                return i+1;
            }

            if (nums[i] < target) {
                i = i + currentDelta;
            }
            if (nums[i] > target) {
                i = i - currentDelta;
            }
            currentDelta = currentDelta / 2;

        } while (i < size && i > 0 && currentDelta > 0);
        if (i+1 == size && nums[i] < target) {
            return size;
        }
        if (i+1 < size && nums[i+1] == target) {
            return i+1;
        }
      return i;
    }

    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();
       // int [] nums = new int [] {1,3,5,6};
        //System.out.println(sip.searchInsert(nums, 5));
    //2

        //int [] nums = new int [] {1,3,5,6};
        //System.out.println(sip.searchInsert(nums, 7));
       //4

        int [] nums = new int [] {1,3};
        System.out.println(sip.searchInsert(nums, 1));
        //0
    }
}
