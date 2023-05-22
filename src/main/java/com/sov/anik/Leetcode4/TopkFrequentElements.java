package com.sov.anik.Leetcode4;

import com.sov.anik.leetcode.Utils;

import java.util.*;

public class TopkFrequentElements {
    //https://leetcode.com/problems/top-k-frequent-elements/
    public static void main (String[] args) {
        int [] nums = new int []{1,1,1,2,2,3};
        int k = 2;
        //[1,2]
        int [] nums2 = new int []{1,2};

        int[] res = topKFrequent(nums, k);
        //System.out.println("answer");
        //Utils.printArray(res);

    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map <Integer, Integer> freq = new HashMap <Integer, Integer>();
        List<Integer> elems = new ArrayList <>();

        for (int n : nums) {
            if (freq.containsKey(n)) {
                int less = freq.get(n);
                freq.put(n, less + 1);
            } else {
                freq.put(n, 1);
                elems.add(n);
            }
        }
        return tok(freq, elems, k);
    }

    private static int[] tok (Map<Integer, Integer> freq, List<Integer> elem, int k) {
        Map<Integer, List<Integer>> high = new HashMap <>();
        List<Integer> frq = new ArrayList <>();

         for(Integer el : elem) {
             int amountOf = freq.get(el);
             if (!high.containsKey(amountOf)) {
                  high.put(amountOf, new ArrayList <>());
                  frq.add(amountOf);
             }
             List <Integer> listok = high.get(amountOf);
             listok.add(el);
             high.put(amountOf, listok);
         }

         //Utils.printMapList(high);

         Collections.sort(frq);
         Collections.reverse(frq);
         return getResult(frq, high, k);
    }

    private static int[] getResult (List<Integer> frq, Map<Integer, List<Integer>> high, int k) {
        int j = 0;
        int [] result = new int [k];

        for(int i = 0; i < frq.size() && i < k; i++) {
            int amount = frq.get(i);

            for(Integer lis : high.get(amount)) {
                if(j >= k) {
                    return result;
                }
                result[j] = lis;
                j++;
            }
        }
        return result;
    }


}
