package com.sov.anik.leetcode;

//https://leetcode.com/problems/valid-palindrome/
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        char[] text = s.toLowerCase().replaceAll("[^A-Za-zА-Яа-я0-9]", "").toCharArray();
        int len = text.length;
        if (len < 2) {
            return true;
        }
        int ind1 = 0;
        int ind2 = len -1;
        while(ind2 - ind1 >= 0) {
           if (text[ind1] != text[ind2]) {
               return false;
           } else {
               ind1++;
               ind2--;
           }
        }

        return true;

    }

    public static void main(String[] args) {
        ValidPalindrome vp = new ValidPalindrome();
        String s = new String("A man, a plan, a canal: Panama");
        System.out.println(vp.isPalindrome(s));
    }
}
