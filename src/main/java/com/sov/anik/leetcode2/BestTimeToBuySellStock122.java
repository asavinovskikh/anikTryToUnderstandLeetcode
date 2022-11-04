package com.sov.anik.leetcode2;

import java.util.Arrays;

public class BestTimeToBuySellStock122 {

    public static int maxProfitItem(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int max = 0;
        int indexMin = 0;
        int indexMax = 0;
        for(int i = 1; i < n; i++) {
            if (prices[i] > min) {
                if (prices[i] - min > max) {
                    max = prices[i] - min;
                    indexMax = i;
                }
            } else {
                min = prices[i];
                indexMin = i;
            }
        }
        int k = 0;

        System.out.println(indexMax + " " + indexMin);
        if (n - indexMax > 2){
            k = maxProfitItem(Arrays.copyOfRange(prices, indexMax+1, n));
        }
        return max + k;
    }

    public static int maxProfit(int[] prices){
        //TODO переписать мб.
        int n = prices.length;
        int lastBuy = - prices[0];
        int lastSold = 0;

        if (n == 0) return 0;

        for (int i = 1; i < n; i++) {
            int curBuy = Math.max(lastBuy, lastSold - prices[i]);
            int curSold = Math.max(lastSold, lastBuy + prices[i]);
            lastBuy = curBuy;
            lastSold = curSold;
        }
        return lastSold;
    }

    public static void main(String[] args) {
        int[] a = new int[] {7,1,5,3,6,4};
        //int[] a = new int[] {7,1,5,3,6,4};
        //int[] a = new int[] {7,6,4,3,1};
        System.out.println(maxProfit(a));
    }

}
