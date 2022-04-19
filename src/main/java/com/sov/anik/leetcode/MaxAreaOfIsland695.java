package com.sov.anik.leetcode;

public class MaxAreaOfIsland695 {

    public int maxAreaOfIsland(int[][] grid) {
        int mHor = grid.length;
        int mVer = grid[0].length;

        int maxIcland = 0;
        int currentIsland = 0;

        //printMatrix(grid);

        for(int i = 0; i < mHor; i++) {
            for (int j = 0; j < mVer; j++) {
                if (grid[i][j] < 1) {
                    // просто проходим мимо
                }
                else{
                    currentIsland = count(grid, i, j, mHor, mVer, 0);
                    if (maxIcland < currentIsland) {
                        maxIcland = currentIsland;
                    }
                }
            }
        }
        //printMatrix(grid);
        return maxIcland;
    }

    public int count(int[][] grid, int i, int j, int mHor, int mVer, Integer currentAmount) {
        if (grid[i][j] == 1) {
            //вызываю все вверх вниз влево и вправо
            grid[i][j] = -1;
            currentAmount++;
            if (i+1 < mHor) {
                currentAmount = count(grid, i + 1, j, mHor, mVer, currentAmount);
            }
            if (i >= 1) {
                currentAmount = count(grid, i - 1, j, mHor, mVer, currentAmount);
            }
            if (j + 1 < mVer) {
                currentAmount = count(grid, i, j + 1, mHor, mVer, currentAmount);
            }
            if (j >= 1) {
                currentAmount = count(grid, i, j - 1, mHor, mVer, currentAmount);
            }
        }
        return currentAmount;
    }
}
