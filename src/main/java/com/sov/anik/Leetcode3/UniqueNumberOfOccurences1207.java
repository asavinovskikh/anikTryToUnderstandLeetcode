package com.sov.anik.Leetcode3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurences1207 {

    public static boolean uniqueOccurrences(int[] arr) {

        boolean res = true;

        Map<String, String> count = new HashMap<>();
        int [] b = new int [2001];
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
            k = b[arr[i] + 1000];
            b[arr[i] + 1000] = k + 1;
        }
        Set<Integer> am = new HashSet<>();

        for(int i = 0; i < 2001; i++) {
            k = b[i];
            if (k == 0) {
                continue;
            }
            if (am.contains(k)) {
                return false;
            } else {
                am.add(k);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] a = new int[] {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(a));
    }
}
