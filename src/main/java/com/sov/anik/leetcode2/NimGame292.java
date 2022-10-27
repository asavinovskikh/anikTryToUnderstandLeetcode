package com.sov.anik.leetcode2;

public class NimGame292 {
    public boolean canWinNim(int n) {
        if (n < 4) {
            return true;
        }
        if (n == 4) {
            return false;
        }
        if (n > 4) {
            return (n%4 != 0);
        }
        return false;
    }
}
