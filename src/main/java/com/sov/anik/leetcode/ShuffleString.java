package com.sov.anik.leetcode;
//https://leetcode.com/problems/shuffle-string/
public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] a = new char[indices.length];
        char[] v = s.toCharArray();
        for(int i = 0 ; i < indices.length; i++) {
            a[indices[i]] = v[i];
        }

        return  new String(a);
    }

    public int subtractProductAndSum(int n) {
        int mult = 1;
        int sum = 0;
        int [] a = new int [String.valueOf(n).length()];
        for(int i = 0 ; i < a.length; i++){
            int k = n%10;
            mult*=k;
            sum +=k;
            n=n/10;
        }

        return mult - sum;
    }

    public static void main(String[] args) {
        ShuffleString vvv = new ShuffleString();
        String s = "codeleet";
        //int [] indices = new int [] {4,5,6,7,0,2,1,3};
        //System.out.println(vvv.restoreString(s, indices));
        System.out.println(vvv.subtractProductAndSum(234));
    }
}
