package com.sov.anik.leetcode2;


import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;


public class SubSets78Test {
    @Test
    public void example1() {
        int [] nums = {1,2,3};
        SubSets78 s = new SubSets78();
        List<List<Integer>> result = s.subsets(nums);
        int amount = (int) Math.pow(2, nums.length);
        assertEquals(result.size(), amount);
        System.out.println(result);
    }
}
