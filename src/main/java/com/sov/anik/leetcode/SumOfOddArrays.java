package com.sov.anik.leetcode;

public class SumOfOddArrays {
    public int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;
        int len = arr.length;
        int koef = (len%2==0) ? len/2 : (len+1) /2;

        for(int i = 0; i < len; i++) {
            //System.out.println("" + i + " " + koef);

            sum += arr[i]*koef;
            if (i < len/2) {
                koef = koef+1;
            } else {
                koef = koef-1;
            }
        }
        return sum;


    }

    public static void main(String[] args) {
        SumOfOddArrays s = new SumOfOddArrays();


    }

}
