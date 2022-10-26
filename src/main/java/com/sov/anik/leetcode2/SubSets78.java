package com.sov.anik.leetcode2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


    public class SubSets78 {

        public List<List<Integer>> subsets(int[] nums) {
            int n = nums.length;
            List<List<Integer>> subResult = subsets(Arrays.asList(nums).subList(0, n-1));
            return subResult;
        }

        private List<List<Integer>> subsets(List<int[]> subList) {
            int n = subList.size();
            List<List<Integer>> result = new ArrayList<>();

            if(n == 1) {
                ArrayList am = new ArrayList<>(Arrays.asList(subList.get(0)));
                result = new ArrayList<>();
                List<Integer> pm = new ArrayList<>();
                result.add(am);
                result.add(pm);
                return result;
            }
            return result;

        }

        private static void joinSomeLetter(List<List<Integer>> sublist, Integer additional) {
            
        }


}
