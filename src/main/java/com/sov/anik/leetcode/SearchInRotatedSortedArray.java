package com.sov.anik.leetcode;

//    https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

        for(int i = 0 ; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] nums = new int [] {4,5,6,7,0,1,2};
        int target = 0;
        SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();
        int  result = search.search(nums, target);
        System.out.printf("result {}", result);

    }

}
