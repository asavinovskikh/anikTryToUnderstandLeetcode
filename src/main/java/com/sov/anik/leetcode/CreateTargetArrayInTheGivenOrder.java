package com.sov.anik.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//https://leetcode.com/problems/create-target-array-in-the-given-order/
public class CreateTargetArrayInTheGivenOrder {

    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> arr = new LinkedList<>();
        int [] result = new int [nums.length];
        for (int i = 0; i < index.length; i++) {
            arr.add(index[i], nums[i]);
        }

        for (int i = 0; i < index.length; i++) {
            result[i] = arr.get(i);
        }
        return result;

    }


    public int[] createTargetArray2(int[] nums, int[] index) {
        Map maymap = new HashMap<Integer, Integer>();

        //LinkedList<Integer> arr = new LinkedList<>();
        int [] result = new int [nums.length];

        for (int i = 0; i < index.length; i++) {
            maymap.put(index[i], nums[i]);
        }

        for (int i = 0; i < index.length; i++) {
            result[i] = (int) maymap.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        CreateTargetArrayInTheGivenOrder rrr = new CreateTargetArrayInTheGivenOrder();
        int [] nums = new int []{0,1,2,3,4};
        int [] index = new int [] {0,1,2,2,1};
        int [] result =
        rrr.createTargetArray2(nums, index);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }


}
