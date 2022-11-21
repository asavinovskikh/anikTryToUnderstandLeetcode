package com.sov.anik.Leetcode3;

import java.util.HashSet;
import java.util.Set;

public class FirstUnique {
    public static int firstUniqueChar(String s) {
        int n = s.length();
        char [] a = s.toCharArray();
        int[] c = new int[26];
        int min = -1;
        for(int i = n-1; i >=0; i--) {
            if (c[a[i] - 'a'] == 1) {
                c[a[i] - 'a'] = -1;
            }
            if (c[a[i]-'a'] == 0) {
                c[a[i] - 'a'] = 1;
            }

        }

        for(int i = 0; i < n; i++) {
            if (c[a[i]- 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("leetcode"));
        System.out.println(firstUniqueChar("loveleetcode"));
    }
}
