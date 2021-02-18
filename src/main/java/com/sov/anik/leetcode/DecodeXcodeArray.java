package com.sov.anik.leetcode;

//https://leetcode.com/problems/decode-xored-array/
public class DecodeXcodeArray {

    public int[] decode(int[] encoded, int first) {
        int [] excode = new int [encoded.length + 1];
        excode[0] = first;
        for(int i = 0; i < encoded.length; i++) {
            excode[i+1] = encoded[i]^excode[i];
        }

        return excode;
    }

    public static void main(String[] args) {
        DecodeXcodeArray dd = new DecodeXcodeArray();
        int[] xcode = new int [] {1,2,3};
        int first = 1;
        dd.decode(xcode, first);
        System.out.println("done");
    }
}
