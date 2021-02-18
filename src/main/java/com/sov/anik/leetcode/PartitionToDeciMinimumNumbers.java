package com.sov.anik.leetcode;

//https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
public class PartitionToDeciMinimumNumbers {

    public int minPartitions(String n) {
        char [] a = n.toCharArray();
        int [] aint = new int [a.length];
        int max = 0;
        for(int i = 0; i < a.length; i++) {
            aint[i] = a[i] - '0';
            if (aint[i] > max) {
                max = aint[i];
            }
        }

        int amount = max;
        //System.out.println(max);
        return max;
    }

    public static void main(String[] args) {
        PartitionToDeciMinimumNumbers rrr = new PartitionToDeciMinimumNumbers();
        rrr.minPartitions("27346209830709182346");
    }
}
