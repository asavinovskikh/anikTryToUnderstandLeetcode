package com.sov.anik.leetcode2;
//https://leetcode.com/problems/minimum-difficulty-of-a-job-schedule/

import static java.lang.Math.max;
import static java.lang.Math.min;

public class MinDiffJobShedule {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int length = jobDifficulty.length;
        int result = (split(jobDifficulty, d,0, length - 1, 0));
        if (result == Integer.MAX_VALUE) {
            return -1;
        }
        return result;
    }

    public int split(int diff[], int d, int a, int b, int minDiff) {
        if (d > b - a) {
            return Integer.MAX_VALUE;
        }
        if (d == 0) {
            return maximum(diff, a, b) + minDiff;
        }
        if (a < b) {
            int res = split(diff, d--, a, b-1, minDiff + diff[b-1]);
            int res2 = split(diff, d--, a + 1, b, minDiff + diff[a]);
            return min(res, res2);
        } else {
            return minDiff;
        }
    }

    public int maximum(int [] diff, int a, int b) {
        int l = diff.length;
        int max = 0;
        for(int i = 0; i < l; i++) {
            if (diff[i] > max) {
                max = diff[i];
            }
        }
        return max;
    }


}
