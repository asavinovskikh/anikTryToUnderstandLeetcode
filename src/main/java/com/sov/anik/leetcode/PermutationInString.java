package com.sov.anik.leetcode;

import java.util.*;

public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        char [] a = s1.toCharArray();
        char [] b = s2.toCharArray();

        HashMap<Integer, Integer> letters = new HashMap<>();
        for(int i = 0; i < 26; i++) {
            letters.put(0,0);
        }
        //todo put some amount of elements

        List<Integer> st = new ArrayList();
        Set<Integer> s = new HashSet();
        Set<Integer> d  = new HashSet();
        if (a.length > b.length) {
            for (int i = 0; i < a.length; i ++) {
                st.add(Integer.valueOf(a[i]));
            }

            for (int i = 0; i < b.length; i ++) {
                d.add(Integer.valueOf(b[i]));
            }
        } else {
            for (int i = 0; i < b.length; i ++) {
                st.add(Integer.valueOf(b[i]));
            }

            for (int i = 0; i < a.length; i ++) {
                d.add(Integer.valueOf(a[i]));
            }
        }
        int n = st.size()-d.size();
        s.addAll(st.subList(0, d.size()));
        for (int i = 0; i < n+1; i++) {
            s.addAll(st.subList(i, i+ d.size()));
            if (s.containsAll(d) && d.containsAll(s)) {
                return true;
            }
            s.clear();
        }
        return false;
    }


    private String spr(Set<Integer> ss) {
        StringBuilder sres = new StringBuilder();
        for(Integer it : ss) {
            sres.append(it + " ");
        }
        return sres.toString();
    }

    public static void main(String[] args) {
        PermutationInString pm = new PermutationInString();
        System.out.println(pm.checkInclusion("dcda", "adc"));
        System.out.println(pm.checkInclusion("qwert", "rew"));
        System.out.println(pm.checkInclusion("eidbaooo", "ab"));
        System.out.println(pm.checkInclusion("skirt", "rps"));
        System.out.println(pm.checkInclusion("qwert", "qwrt"));
    }
}
