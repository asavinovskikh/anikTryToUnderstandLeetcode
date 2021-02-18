package com.sov.anik.leetcode;

//https://leetcode.com/problems/xor-operation-in-an-array/
public class XorInOperationOnArray {

    public int xorOperation(int n, int start) {
        int k = start;
        int currentResult = 0;
        for (int i = 0; i < n; i++) {
            k=start + 2*i;
            //System.out.println(k);
            currentResult ^= k;
        }
        return currentResult;
    }

    public static void main(String[] args) {
        XorInOperationOnArray r = new XorInOperationOnArray();
       // System.out.println(r.xorOperation(5, 0));
        System.out.println(r.xorOperation(4, 3));
    }
}
