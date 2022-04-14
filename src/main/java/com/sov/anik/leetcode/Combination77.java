package com.sov.anik.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combination77 {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (k == 0) {
            result.add(new ArrayList<Integer>());
            return result;
        }

        if (k > n ) {
            return result;
        }
        //c энкой но на 1 меньше
        result = combine(n - 1, k - 1);

        for (List<Integer> list : result) {
            list.add(n);
        }

        //без энки
        result.addAll(combine(n - 1, k));


        return result;
    }
}
