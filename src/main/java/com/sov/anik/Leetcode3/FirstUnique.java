package com.sov.anik.Leetcode3;

import java.util.HashSet;
import java.util.Set;

public class FirstUnique {
    public int firstUniqChar(String s) {
        int n = s.length();
        char [] a = s.toCharArray();
        char[] c = new char[26];
        int min = -1;
        for(int i = 0; i < n; i++) {
            if (c[a[i]] == 0) {
                c[a[i]] = 1;
            }
            if (c[a[i]] == 1) {

            }
        }
        return 0;
    }
}
