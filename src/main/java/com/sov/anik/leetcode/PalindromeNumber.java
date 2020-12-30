package com.sov.anik.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeNumber {

        public boolean isPalindrome(int x) {
            if (x < 0) {
                return false;
            }
            if (x == 0) {
                return true;
            }

            List<Integer> a = new ArrayList<>();
            int ind = 0;
            while(x > 0) {
                a.add(x % 10);
                ind++;
                x /= 10;
            }

            int size = a.size();
            int index = 0;
            while(index < size/2){
                if (a.get(index) != a.get(size-1-index)){
                    return false;
                }
                index++;
            }

            return true;

        }


    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
        System.out.println(pn.isPalindrome(121));
        //System.out.println(pn.isPalindrome(1000021));
    }
}
