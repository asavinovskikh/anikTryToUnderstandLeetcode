package com.sov.anik.Leetcode4;

public class AddBinary {
    public static void main (String[] args) {

        AddBinary addBinary = new AddBinary();

        System.out.println(addBinary.addBinary("1010", "1011"));
        //System.out.println(addBinary.addBinary("1101", "1011"));
        //System.out.println(addBinary.addBinary("10", "01"));
        //System.out.println(addBinary.addBinary("11", "1"));
    }

    public String addBinary(String a, String b) {
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        int max_a = aa.length;
        int max_b = bb.length;
        int max = Math.max(max_a, max_b) ;
        if (max < 1) {
            return new String("0");
        }
        int[] result = new int[max + 1];

        int next = 0;
        int a1 = 0;
        int b1 = 0;
        for(int i = max; i > 0; i--) {
            if(max_a > 0 && aa[max_a-1] == '1') {
                a1 = 1;
            } else {
                a1 = 0;
            }
            if(max_b > 0 && bb[max_b-1] == '1') {
                b1 = 1;
            } else {
                b1 = 0;
            }
            result[i] = (a1 + b1 + next) % 2;
            next = (a1 + b1 + next) / 2;

            max_a--;
            max_b--;
        }
        if (next > 0) {
            result[0] = next;
        }

        return makeString(result);
    }

    private String makeString (int[] result) {
        StringBuilder sb =  new StringBuilder();
        boolean first = true;
        for(int i  : result) {
            if (first) {
                if (i > 0) {
                    sb.append("" + i);
                }
                first = false;
                continue;
            }
            sb.append("" + i);
        }
        return sb.toString();
    }
}
