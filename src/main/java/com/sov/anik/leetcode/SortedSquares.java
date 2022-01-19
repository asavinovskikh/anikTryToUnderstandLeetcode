package com.sov.anik.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedSquares {


    //cheat
    public int[] sortedSquares(int[] nums) {
        List<Integer> list = new ArrayList(nums.length);
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i] * nums[i]);
        }
        Collections.sort(list);
        int [] result = list.stream().mapToInt(i -> i).toArray();
        return result;
    }

}
