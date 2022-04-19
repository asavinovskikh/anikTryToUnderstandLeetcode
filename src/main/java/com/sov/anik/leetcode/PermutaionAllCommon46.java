package com.sov.anik.leetcode;

import java.util.*;

public class PermutaionAllCommon46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<Integer> current = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        return result;
    }

    public static void mapper(int [] num, List<Integer> current, List<List<Integer>> result, boolean[] old) {
        if (num.length == 0) {

        }
        for(int i = 0; i < num.length; i++) {
            if (old[i] == false) {
                old[i] = true;
                current.add(num[i]);
                mapper(num, current, result, old);
                current.remove(num[i]);
                old[i] = false;
            }
        }

    }



}
