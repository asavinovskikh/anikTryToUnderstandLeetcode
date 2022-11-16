package com.sov.anik.leetcode2;

public class GuessNumber374 {

    static int amount = 7;

    public static int guessNumber(int n) {
        return guessNum(0, n);
    }

    public static int guessNum(int min, int max) {
        System.out.println(min + " " + max);

        if (max-min < 2) {
            return (guess(max) == 0) ? max : min;
        }

        int curr = (max-min)/2 + min;

        int k = guess(curr);
        if (k == 0) {
            return curr;
        }
        if (guess(curr) < 0) {
            return guessNum(min, curr-1);
        } else {
            return guessNum(curr+1, max);
        }
    }

    public static void main(String[] args) {
        //amount = 7;
        //System.out.println(guessNumber(10));

        amount = 2126753390;
        System.out.println(guessNumber(1702766719));

    }

    public static int guess(int c) {
        if(c < amount) return 1;
        if (c > amount) return -1;
        else return 0;
    }

}
