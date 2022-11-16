package com.sov.anik.leetcode2;
import com.sov.anik.leetcode.Utils;

public class RemoveDuplicates26 {

    public static int removeDuplicates(int[] nums) {
        int i = nums.length > 0 ? 1 : 0;
        for (int n : nums)
            if (n > nums[i-1])
                nums[i++] = n;
        //Utils.printArray(nums);
        return i;
    }

    public static int removeDuplicates0(int[] nums) {

        int n = nums.length;
        if (n < 2 ) {
            return n;
        }

        int count_removed = 0;
        int wr = 0;
        int left = 0;
        int right = 1;
        while(wr + count_removed < n) {
            while(right < n) {
                if (nums[left] == nums[right]) {
                right++;
                } else {
                    wr++;
                    nums[wr] = nums[right];
                    count_removed += right-left;
                    left = right;
                }

            }
            wr++;
            nums[wr] = nums[left];
        }

        for(int i = 0; i < count_removed; i++) {
            nums[n-i-1] = '0';
        }

        Utils.printArray(nums);
        return count_removed;
    }

    public static void main(String[] args) {
        //int [] a = new int [] {1,2,3,4,4,4,4};
        int [] a = new int [] {1,1,2};
        removeDuplicates(a);
    }
}
