package com.sov.anik.leetcode;

import java.util.LinkedList;
import java.util.Queue;

import static com.sov.anik.leetcode.Utils.printMatrix;

public class RottingOranges994 {

    public int orangesRotting(int[][] grid) {
        int lenH = grid.length;
        int lenV = grid[0].length;
        Queue<int[]> ok = new LinkedList<>();

        int days = 0;
        for(int i = 0; i < lenH; i++){
            for(int j =0; j < lenV; j++) {
                if (grid[i][j] == 1) {
                    ok.add(new int[] {i, j});
                }
            }
        }
        LinkedList<int[]> currentOk = new LinkedList<>();

        while (!ok.isEmpty()){
            Queue<int[]> yetEnough = new LinkedList<>();
            while (!ok.isEmpty()) {
                int[] elem = ok.poll();

                if (rott(grid, elem[0], elem[1], lenH, lenV)) {
                    currentOk.add(elem);
                } else {
                    yetEnough.add(elem);
                }
            }
            if (yetEnough.isEmpty()) {
                return -1;
            }
            while(!yetEnough.isEmpty()){
                int[] elem = yetEnough.poll();
                grid[elem[0]][elem[1]] = 2;
            }
            ok.addAll(currentOk);
            currentOk.clear();
            days++;
            System.out.println(days);
            printMatrix(grid);
        }
        return days;
    }

    public boolean rott(int [][] grid, int i, int j, int maxH, int maxV) {
            if (i-1 >= 0) {
                if (grid[i - 1][j] == 2) {
                    grid[i][j] = 3;
                    return false;
                }
            }
            if (i+1 < maxH) {
                if(grid[i+1][j] == 2) {
                    grid[i][j] =3;
                    return false;
                }
            }
            if (j-1 >= 0) {
                if(grid[i][j-1] == 2) {
                    grid[i][j] =3;
                    return false;
                }
            }
            if (j+1 < maxV) {
                if(grid[i][j+1] == 2) {
                    grid[i][j] =3;
                    return false;
                }
            }
            return true;
        }
}
