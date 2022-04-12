package com.sov.anik.leetcode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMultiply2233 {
    public static int maximumProduct(int[] nums, int k) {

        List<Integer> mult = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            mult.add(nums[i]);
        }


        for(int i = 0; i < k; i++) {
            Collections.sort(mult);
            mult.set(0, mult.get(0) + 1);
        }

        return multiple(mult);
    }
    public static int multiple(List<Integer> mult) {
        BigInteger a = new BigInteger("1");
        for (int i = 0; i < mult.size();i++) {
            a = (BigInteger) a.multiply(BigInteger.valueOf(mult.get(i)));
        }

        BigInteger b = new BigInteger("1000000000");
        b = b.add(BigInteger.valueOf(7));
        BigInteger result = a.mod(b);
        return result.intValue();
    }
}
