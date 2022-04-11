package com.sov.anik.leetcode;

import java.util.HashSet;
import java.util.Set;

public class FirstUniqueCharacters387 {

//    https://leetcode.com/problems/first-unique-character-in-a-string/

    public static int firstUniqueChar(String s) {

        int[] alphabet = new int[26];
        Set<Integer> is = new HashSet<Integer>();

        for (int i = 0; i < 26; i++) {
            alphabet[i] = Integer.MAX_VALUE;
            is.add(i + 'a');
        }
        char [] a = s.toCharArray();
        for(int i = 0;  i< a.length; i++) {
            if (is.isEmpty()) {
                return -1;
            }
            if (alphabet[a[i]-'a'] == Integer.MAX_VALUE) {
                alphabet[a[i]-'a'] = i;
            }
            if (alphabet[a[i]-'a']  < Integer.MAX_VALUE) {
                alphabet[a[i]-'a'] = -1;
                is.remove(alphabet[a[i]]);
            }
        }

        // пробежать по is - и посмотреть все индексы
        int minimum = Integer.MAX_VALUE;
        for(int i = 0; i < 26; i++) {
            if (is.contains(i)) {
                if (minimum > alphabet[i]) {
                    minimum = alphabet[i];
                }
            }
        }
        return minimum;
    }
}
