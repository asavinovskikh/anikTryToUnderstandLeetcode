package com.sov.anik.Leetcode3;

import java.util.HashSet;
import java.util.Set;

public class SudokuEasy2133 {
    //check every row and column contains all numbers
    public boolean checkValid(int[][] matrix) {

        int n = matrix.length;
        for (int r = 0; r < n; ++r) {
            Set<Integer> row = new HashSet<>();
            Set<Integer> col = new HashSet<>();
            for (int c = 0; c < n; ++c) {
                if (!row.add(matrix[r][c]) || !col.add(matrix[c][r])) {
                    return false;
                }
            }
        }
        return true;
    }

}
