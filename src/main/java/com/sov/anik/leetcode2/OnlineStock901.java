package com.sov.anik.leetcode2;

import java.util.Stack;

public class OnlineStock901 {

    Stack<int []> prices = new Stack<>();

    public OnlineStock901() {
    }

    public int next(int price) {
        int res = 1;
        while(!prices.empty() && prices.peek()[0] <= price) {
            res += prices.pop()[1];
        }
        prices.push(new int[]{price, res});
        return res;
    }


}
