package com.sov.anik.Leetcode3;

public class FindPivotIndex724 {
    public static int pivotIndex(int[] nums) {
        int leftsum = 0;
        int rightsum = 0;
        int n = nums.length;

        for(int i = 1; i < n; i++) {
            rightsum += nums[i];
        }

        for(int i = 1; i < n; i++) {
            //System.out.println(leftsum + " " + i + " " + rightsum);
            if (leftsum == rightsum) {
                return i-1;
            }
            rightsum -= nums[i];
            leftsum += nums[i-1];
        }
        if (leftsum == rightsum) {
            return n-1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
       // int[] ar = new int[] {1,7,3,6,5,6};

       // System.out.println(pivotIndex(ar));

//        int [] ab = new int[] {-1,-1,0,1,0,-1};
//        System.out.println(pivotIndex(ab));

//        int [] ab = new int[] {-1,-1,0,1,1,0};
//        System.out.println(pivotIndex(ab));

        int [] ab = new int[] {1,0};
        System.out.println(pivotIndex(ab));
    }
}
