package com.sov.anik.leetcode2;

import java.util.Stack;

public class DailyTemperatures739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> que = new Stack();
        int n = temperatures.length;
        int [] daily = new int [n];

        for(int i = 0; i < n; i++) {
            while(!que.empty() && temperatures[i] > temperatures[que.peek()]) {
                int c = que.pop();
                daily[c] = i - c;
            }
            que.push(i);
        }


        for(int i = 0; i < n; i++) {
            System.out.println(daily[i]);
        }
        return daily;
    }

    public static void main(String[] args) {
        int [] temp = new int[] {73,74,75,71,69,72,76,73};
        dailyTemperatures(temp);
    }
}
