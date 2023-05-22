package com.sov.anik.Leetcode3;

import static java.lang.Math.min;

public class LongestBalancedSubstring {

    public static void main (String[] args) {
        //String s = new String("01000111");
        String s = new String("00111");
        System.out.println(findTheLongestBalancedSubstring(s));
    }

       public static int findTheLongestBalancedSubstring(String s) {
           int k = s.length();
           int max = 0;
           if (k < 1) {
               return 0;
           } else {
               char [] a = s.toCharArray();
               boolean zeromode = true;
               int bal = 0;
               int bal1 = 0;
               for(int i = 0; i < k; i++) {
                   if (zeromode && a[i] == 48) {
                       bal++;
                       continue;
                   }
                   if (zeromode && a[i] == 49) {
                       zeromode = false;
                       bal1++;
                       continue;
                   }
                   if (!zeromode && a[i] == 48) {
                       if (bal1 > max && bal > max) {
                           max = min(bal1, bal);
                       }
                       bal = 1;
                       bal1 = 0;
                       zeromode = true;
                       continue;
                   }
                   if (!zeromode && a[i] == 49) {
                       bal1++;
                       continue;
                   }
               }
               if (bal1 > max && bal > max) {
                   max = min(bal1, bal);
               }
               return 2*max;
           }
       }
}
