package com.sov.anik.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Permutations46 {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int size = nums.length;

        return result;
    }

    public void fill(HashSet<Integer> numSet, int[] filled, int size) {
        if(!numSet.isEmpty()) {
            for(int i = 0; i < filled.length; i++) {
                if (filled[i] == 0) {

                }
            }
        }
    }
}
