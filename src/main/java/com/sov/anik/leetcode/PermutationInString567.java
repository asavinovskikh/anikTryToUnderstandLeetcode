package com.sov.anik.leetcode;

import java.util.*;

public class PermutationInString567 {

    public static boolean permutation(String s1, String s2) {
        int [] a = new int[26];
        //we want first string as bigger than another
        char[] bigString = s1.toCharArray();
        char[] smallString = s2.toCharArray();
        if (s1.length() < s2.length()) {
            bigString = s1.toCharArray();
            smallString = s2.toCharArray();
        }
        List<Integer> massofletters = new ArrayList<>();

        for(int i = 0; i < smallString.length; i++) {
            a[smallString[i]-97] = a[smallString[i]-97] + 1;
            massofletters.add(smallString[i]-97);
        }
        List<Integer> floatMass = new ArrayList<>(massofletters);
        List<Integer> copyofcopy = new ArrayList<>();
        for(int i = 0; i < bigString.length; i++)
            if (massofletters.contains(bigString[i]-97) && floatMass.contains(bigString[i]-97)) {
                copyofcopy.add(bigString[i]-97);
                floatMass.remove(Integer.valueOf(bigString[i]-97));
                if (copyofcopy.containsAll(massofletters) && floatMass.isEmpty()) {
                    return true;
                }

            } else {
                copyofcopy.clear();
                floatMass.clear();
                floatMass.addAll(massofletters);
            }
        if (massofletters.isEmpty()) {
            return true;
        }
        return false;
    }

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
        PermutationInString567 pm = new PermutationInString567();
        System.out.println(permutation("dcda", "adc"));
      //  System.out.println(pm.checkInclusion("dcda", "adc"));
        System.out.println(permutation("qwert", "rew"));
        System.out.println(permutation("eidbaooo", "ab"));
        System.out.println(permutation("skirt", "rps"));
        System.out.println(permutation("qwert", "qwrt"));
    }
}
