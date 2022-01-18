package com.sov.anik.leetcode;

//find-first-and-last-position-of-element-in-sorted-array
public class FindFirstAndLastPositionOfElement {

    public int[] searchRange(int[] nums, int target) {
        int [] result = new int [] {-1, -1};
        int length = nums.length;

        int i = 0;
        while (i < length && nums[i] < target) {
            i++;
        }
        while (i < length && nums[i] == target) {
            if (result[0] == -1) {
                result[0] = i;
            }
            result [1] = i;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums = new int [] {5,7,7,8,8,10};
        int target = 6;
        FindFirstAndLastPositionOfElement find = new FindFirstAndLastPositionOfElement();
        int [] result = find.searchRange(nums, target);
        System.out.printf("result {} {}", result[0], result[1]);

    }
}
