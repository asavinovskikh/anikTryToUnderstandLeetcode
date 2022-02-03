package com.sov.anik.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
        public int lengthOfLongestSubstring(String s) {
            char[] all = s.toCharArray();
            Set<Character> d = new HashSet();
            List<Character> dC = new ArrayList();
            int maxLength = 0;
            int size = all.length;
            if (size == 1) {
                return 1;
            }
            if (size == 0) {
                return 0;
            }
            int index = 0;
            for (int i = 0; i < size; i++) {
                if (dC.contains(all[i])) {
                    index = dC.lastIndexOf(all[i]);
                    int sizeInto = dC.size();
                    dC = dC.subList(index+1, sizeInto);
                }
                dC.add(all[i]);

                if (maxLength < dC.size()) {
                    maxLength = dC.size();
                }
                // System.out.println("" + all[i] + " " + maxLength);

            }

            return maxLength;
        }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeating lg = new LongestSubstringWithoutRepeating();
        System.out.println(" - " + lg.lengthOfLongestSubstring("") + " should be " + 0);
        System.out.println("au -" + lg.lengthOfLongestSubstring("au") + " s  hould be " + 2);
        System.out.println("aabaab!bb - " + lg.lengthOfLongestSubstring("aabaab!bb") + " should be " + 3);
        System.out.println("bbbbb - " + lg.lengthOfLongestSubstring("bbbbb") + " should be " + 1);
        System.out.println( "pwwkew - " + lg.lengthOfLongestSubstring("pwwkew") + " should be " + 3);
        System.out.println( "abcabcbb - " + lg.lengthOfLongestSubstring("abcabcbb") + " should be " + 3);
        System.out.println( "bpfbhmipx - " + lg.lengthOfLongestSubstring("bpfbhmipx") + " should be " + 7  );

    }

}
