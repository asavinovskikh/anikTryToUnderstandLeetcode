package com.sov.anik.leetcode2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RemoveAllDuplicates1047 {

    public static String removeDuplicates(String s) {
        char [] a = s.toCharArray();
        int n = a.length;
        if (n < 2) {
            return s;
        }

        List<Character> qu = new ArrayList<Character>();
        int first = n/2;
        int second = n/2+1;

        while(first >= 0 && second < n)

        qu.add(a[n-1]);
        StringBuilder b = new StringBuilder();
        for(char re : qu) {
            b.append(re);
            // System.out.println(re);
        }
        return b.toString();
    }


    public static String removeDuplicates0(String s) {
            char [] a = s.toCharArray();
            int n = a.length;
            if (n < 2) {
                return s;
            }

            List<Character> qu = new ArrayList<Character>();
            int prev = 0;
            for(int i = 1; i < n; i++) {
                if(a[i] != a[prev]) {
                    qu.add(a[prev]);
                    prev++;
                }
            }
            qu.add(a[n-1]);
        StringBuilder b = new StringBuilder();
        for(char re : qu) {
            b.append(re);
           // System.out.println(re);
        }
        return b.toString();
    }

    public static void main(String[] args) {
        //System.out.println(removeDuplicates("ababab"));
        System.out.println(removeDuplicates("abbaca"));
    }


}
