package com.sov.anik.Leetcode3;

import java.util.*;

public class MaxStringNumeric {
    public static void main(String[] args) {
        //int [] vals = {1,2,3,4,10,-10,-20};
        //int [][] edges = {{0,1},{1,2},{1,3},{3,4},{3,5},{3,6}};

        int [] vals = {-5};
        int [][] edges = {};
        int k = 0;

        System.out.println(maxStarSum(vals, edges,k));
//        String [] a = new String[] {"alic3","bob","3","4","00000"};
//        System.out.println(amountNumericMax(a)); //false
//
//        String [] b = new String[] {"1","01","001","0001"};
//        System.out.println(amountNumericMax(b)); //false
    }

    public static int maxStarSum(int[] vals, int[][] edges, int k) {

       int [] a = new int[vals.length];
        for(int i = 0; i < vals.length; i++) {
            int amountMaxsize = vals[i];
            List<Integer> pairs = new ArrayList<>();

            for (int j = 0; j < edges.length; j++) {
                if (edges[j][0] == i) {
                    int value = edges[j][1];
                    int wvalue = vals[value];
                    pairs.add(wvalue);
                }
                if (edges[j][1] == i) {
                    int value = edges[j][0];
                    int wvalue = vals[value];
                    pairs.add(wvalue);
                }
            }
            Collections.sort(pairs);
            Collections.reverse(pairs);
            for(int ii = 0; ii < pairs.size() && ii < k; ii++) {
                if (pairs.get(ii) < 0) {
                    break;
                }
                amountMaxsize +=pairs.get(ii);
            }
            a[i] = amountMaxsize;
        }

        int maxresult = a[0];
        for(int ik = 1; ik < vals.length; ik++) {
            if (maxresult < a[ik]) {
                maxresult = a[ik];
            }
        }

        return maxresult;
    }



//    private int amountNumericMax(String [] numberlett) {
//        int max = 0;
//        for (String s : numberlett) {
//            int k = getAm(s);
//            if (k > max) {
//                max = k;
//            }
//        }
//        return max;
//    }
//
//    private int getAm(String s) {
//        boolean onlyInt = true;
//        char [] a =s.toCharArray();
//        for(char ch: a) {
//            if (Character.isLetter(ch)) {
//                onlyInt = false;
//                break;
//            }
//        }
//        if (onlyInt) {
//            return Integer.parseInt(s);
//        } else {
//            return s.length();
//        }
//    }
}
