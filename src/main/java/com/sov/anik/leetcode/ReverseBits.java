package com.sov.anik.leetcode;

//https://leetcode.com/problems/reverse-bits/

public class ReverseBits {
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 31; i >= 0; i--) {
            result += ((n >> i) & 1) * (1 << (31 - i));
        }
        return result;
    }

    public static void main(String[] args) {
        ReverseBits r = new ReverseBits();
        String binary = "0000010100101000001111010011100";
        int n = Integer.parseInt(binary, 2);
        System.out.println(r.reverseBits(3221471));
    }
}
