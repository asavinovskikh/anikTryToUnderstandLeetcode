package com.sov.anik.leetcode;

public class NumberOfOneBits191 {
        // you need to treat n as an unsigned value
        public static int hammingWeight(int n) {
            int amount = 0;
            String number = Integer.toBinaryString(n);
            char[] anum = number.toCharArray();
            for(int i = 0; i < anum.length; i++) {
                if (anum[i] == '1') {
                    amount++;
                }
            }
            return amount;
        }


}
