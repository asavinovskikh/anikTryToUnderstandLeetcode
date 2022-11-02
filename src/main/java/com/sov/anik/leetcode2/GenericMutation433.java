package com.sov.anik.leetcode2;

import java.util.*;

public class GenericMutation433 {
    public int minMutation(String start, String end, String[] bank) {

        if (start.equals(end)) {
            return 0;
        }

        char[] charSet = new char[]{'A', 'C', 'G', 'T'};

        Set<String> banks = new HashSet<>();
        for(String s : bank) {
            banks.add(s);
        }
        int level = 0;
        Set<String> checked = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        q.offer(start);
        checked.add(start);

        while(!q.isEmpty()) {
            int currAmount = q.size();
            while(currAmount-- > 0) {
                String current = q.poll();
                if (current.equals(end)) {
                    return level;
                }
                char[] st = current.toCharArray();
                for(int i = 0; i < st.length; i++) {
                    char prev = st[i];

                    for(char ch : charSet) {
                        st[i] = ch;
                        String maybe = new String(st);
                        if (banks.contains(maybe) && !checked.contains(maybe)) {
                            checked.add(maybe);
                            q.offer(maybe);
                        }
                    }
                    st[i] = prev;
                }
            }
            level++;
        }
        return -1;
    }

    public static int distance(String a, String b) {
        int res = 0;
        char [] a1 = a.toCharArray();
        char [] b1 = b.toCharArray();

        for(int i = 0; i < a.length(); i++) {
            if (a1[i] != b1[i]) {
                res++;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        GenericMutation433 g = new GenericMutation433();
        String start = new String("AACCGGTT");
        String end = new String("AACCGGTA");
        String [] list = new String[1];
        list[0] = new String("AACCGGTA");
        int result = g.minMutation(start, end, list);
        System.out.println(result);
    }

}
