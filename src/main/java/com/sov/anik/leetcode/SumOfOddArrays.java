package com.sov.anik.leetcode;

public class SumOfOddArrays {
    public int sumOddLengthSubarrays(int[] arr) {

        int sumResult = 0;
        int len = arr.length;
        int koef = (len%2==0) ? len/2 : (len+1) /2;
        if (len < 1) {
            return 0;
        }
        for(int i = 1; i <= len; i+=2) {
            sumResult += summArrayOfInt(arr, i, len);
        }
        return sumResult;
    }

    public int summArrayOfInt(int [] arr, int k, int len) {
        int sum = 0;
        for(int i = 0; i <= len - k; i++) {
            int currSum = 0;
            for(int j = 0; j < k; j++) {
                currSum += arr[i+j];
            }
            sum +=currSum;
        }
        //System.out.println("suumOf " + k + "  = " + sum);
        return sum;
    }

    public static void main(String[] args) {
        SumOfOddArrays s = new SumOfOddArrays();
        int [] arr = new int []{1,4,2,5,3};
        System.out.println(s.sumOddLengthSubarrays(arr));


    }

}
