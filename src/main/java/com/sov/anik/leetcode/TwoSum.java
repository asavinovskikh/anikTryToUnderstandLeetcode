package com.sov.anik.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//https://leetcode.com/problems/two-sum/
public class TwoSum {


    public int[] twoSum(int[] nums, int target) {
        int[] a = new int [2];
        
        List<Integer> arrr = Arrays.stream(nums)
                .boxed()
               // .filter(x -> x < target)
               // .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        int size = arrr.size();

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (getSumm(arrr, i, j, target) == 0) {
                    a[0] = i;
                    a[1] = j;
                    return a;
                }
            }
        }
        a[0] = 0;
        a[1] = 0;
        return a;
    }

    public static int getSumm (List<Integer> a, int b, int c, int target) {
        if (a.get(b) + a.get(c) == target) {
            return 0;
        }
        if (a.get(b) + a.get(c) < target) {
            return -1;
        }
        return 1;
    }


    public static int getSumm (int[] a, int b, int c, int target) {
        if (a[b] + a[c] == target) {
            return 0;
        }
        if (a[b] + a[c] < target) {
            return -1;
        }
        return 1;
    }

    public static void main(String[] args) {
        //int[] c = new int []{2,7,11,15};
        //int target = 9;
        int[] c = new int []{3,2,4};
        int target = 6;
        int[] result = new int [2];
        TwoSum tw = new TwoSum();

        result = tw.twoSum(c,target);
        return;
    }

}
