package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static com.sov.anik.leetcode.FloodFill733.printMatrix;
import static com.sov.anik.leetcode.UpdateMatrix542.updateMatrix;

class UpdateMatrix542Test {
    @Test
    public void updateMatrixTest() {
        int [][] a = new int [][]{ {0,0,0}, {0,1,0}};
        printMatrix(a);
        int [][] b = updateMatrix(a);;
        printMatrix(b);
    }

    @Test
    public void update2MatrixTest() {
        int [][] a = new int [][]{ {0,0,0}, {0,1,0}, {1, 1,1}};
        printMatrix(a);
        int [][] b = updateMatrix(a);;
        printMatrix(b);
    }

    @Test
    public void update0MatrixTest() {
        int [][] a = new int [][]{ {0,0,0}, {0,1,0}, {0,0,0}};
        printMatrix(a);
        int [][] b = updateMatrix(a);;
        printMatrix(b);
    }

    @Test
    public void update0MatrixTest2(){
        int [][] a = new int [][] {
                {1,0,1,1,0,0,1,0,0,1},{0,1,1,0,1,0,1,0,1,1},
                {0,0,1,0,1,0,0,1,0,0},{1,0,1,0,1,1,1,1,1,1},
                {0,1,0,1,1,0,0,0,0,1},{0,0,1,0,1,1,1,0,1,0},
                {0,1,0,1,0,1,0,0,1,1},{1,0,0,0,1,1,1,1,0,1},
                {1,1,1,1,1,1,1,0,1,0},{1,1,1,1,0,1,0,0,1,1}
        };
        int [][]b = updateMatrix(a);
        int [][] c = new int [][] {
                {1,0,1,1,0,0,1,0,0,1},{0,1,1,0,1,0,1,0,1,1},
                {0,0,1,0,1,0,0,1,0,0},{1,0,1,0,1,1,1,1,1,1},
                {0,1,0,1,1,0,0,0,0,1},{0,0,1,0,1,1,1,0,1,0},
                {0,1,0,1,0,1,0,0,1,1},{1,0,0,0,1,2,1,1,0,1},
                {2,1,1,1,1,2,1,0,1,0},{3,2,2,1,0,1,0,0,1,1}
        };
        printMatrix(a);
        printMatrix(b);
        printMatrix(c);

    }

}