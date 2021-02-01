package com.sov.anik.leetcode;

import static java.lang.Math.min;

//https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        int lentgh = strs.length;
        if (lentgh == 0) {
            return new String();
        }

        char[] middle = strs[0].toCharArray();
        int i = 1;
        while(i < lentgh) {
            middle = intersect(strs[i].toCharArray(), middle);
            //System.out.println(middle);
            i++;
        }

        return String.valueOf(middle);

    }

    static char[] intersect(char[] Uline, char[] Iline) {
        int lenght  = min(Uline.length, Iline.length);
        int it = 0;
        while(it < lenght) {
            if (Uline[it] == Iline[it]) {
                it++;
            }else {
                break;
            }
        }
        char[] ee = new char[it];
        int i = 0;
        while(i < it) {
            ee[i] = Uline[i];
            i++;
        }
        return ee;
    }

    public static void main(String[] args) {
        LongestCommonPrefix lcp = new LongestCommonPrefix();

        String []strs = new String[] {"flower","flow","flight"};
        String result = lcp.longestCommonPrefix(strs);
        System.out.println(result);
    }
    
}
