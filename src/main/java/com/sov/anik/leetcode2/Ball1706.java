package com.sov.anik.leetcode2;

public class Ball1706 {
    public int[] findBall(int [][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res[] = new int[n];

        for (int i = 0; i < n; ++i) {
            int i1 = i;
            int i2;
            for (int j = 0; j < m; ++j) {
                i2 = i1 + grid[j][i1];
                if (i2 < 0 || i2 >= n || grid[j][i2] != grid[j][i1]) {
                    i1 = -1;
                    break;
                }
                i1 = i2;
            }
            res[i] = i1;
        }
        return res;
    }

}
