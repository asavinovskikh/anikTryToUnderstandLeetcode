package com.sov.anik.leetcode;


//https://leetcode.com/problems/valid-palindrome-ii/
public class ValidPalindrome2 {

    public  boolean validPalindrome(String s) {
            int len = s.length();

            boolean isUpgradePalindrome = false;

            char[] text = s.toLowerCase().replaceAll("[^A-Za-zА-Яа-я0-9]", "").toCharArray();

            if (len < 2) {
            return true;
            }

            int ind1 = 0;
            int ind2 = len -1;

            while(ind2 - ind1 >= 0) {
                if (text[ind1] != text[ind2]) {
                    if (isUpgradePalindrome) {
                        return false;
                    } else {
                        isUpgradePalindrome = true;
                        //remove ind1
                        boolean res = isPalindrome(s.substring(0, ind1) + s.substring(ind1+1));
                        //remove ind2
                        boolean res2;
                        if (ind2 < len - 1) {
                            res2 = isPalindrome(s.substring(0, ind2) + s.substring(ind2+1));
                        }
                        else {
                            res2 = isPalindrome(s.substring(0, ind2));
                        }
                        return res || res2;
                    }
                } else {
                    ind1++;
                    ind2--;
                }
            }

            return true;
    }


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
        ValidPalindrome2 vp = new ValidPalindrome2();
       // String s = new String("A man, a plan, a canal: Panama");
       // String s = new String("dmaadedaeeddeeadedafad");
        String s = new String("cbbcc");
        System.out.println(vp.validPalindrome(s));
    }
}
