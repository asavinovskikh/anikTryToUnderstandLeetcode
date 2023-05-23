package com.sov.anik.Leetcode4;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    //https://leetcode.com/problems/missing-number/
    public int missingNumber(int[] nums) {
        Set <Integer> a = new HashSet <>();
        int max = 0;
        for (int i : nums) {
            a.add(i);
            if (max < i) {
                max = i;
            }
        }

        int avoid = 0;
        for (int i = 0; i < max; i++) {
            if (!a.contains(i)) {
                return i;
            }
        }
        return 0;
    }

    public static void main (String[] args) {
        MissingNumber mm = new MissingNumber();
        int [] a = new int[] {3,0,1};
        int result = mm.missingNumber(a);
        System.out.println(result);
    }
}
