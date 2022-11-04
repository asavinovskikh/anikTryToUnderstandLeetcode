package com.sov.anik.leetcode2;

import java.util.Arrays;

public class BestTimeToBuySellStrock121 {

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int max = 0;
        for(int i = 1; i < n; i++) {
            if (prices[i] > min) {
                max = Math.max(max, prices[i] - min);
            } else {
                min = prices[i];
            }

        }
        return max;
    }

    public static int maxProfit1(int[] prices) {
        int n = prices.length -1;
        int maxDelta = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n+1; j++) {
                if (prices[j] < prices[i]) {
                    continue;
                }
                if(prices[j] > maxDelta + prices[i]) {
                    maxDelta = prices[j] - prices[i];
                }
            }
        }
        return maxDelta;
    }

    public static int maxProfit0(int[] prices) {
        int n = prices.length;
        int max = 0;
        for(int i = 0; i < n-1; i++) {
            int h = calc(prices[i], Arrays.copyOfRange(prices, i + 1, n));
            if (h > max) {
                max = h;

            }
        }
        return max;
    }

    public static int calc(int psi, int[] price) {
        int max = 0;
        for(int i : price) {
            if (i > max) {
                max = i;
            }
        }
        //System.out.println(psi + " - " + max);
        return max - psi;
    }

    public static void main(String[] args) {
        //int[] a = new int[] {7,1,5,3,6,4};
        //int[] a = new int[] {7,6,4,3,1};
        int[] a = new int[] {1,2};
        System.out.println(maxProfit(a));
    }
}
