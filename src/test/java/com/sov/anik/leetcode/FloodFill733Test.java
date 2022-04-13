package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static com.sov.anik.leetcode.FloodFill733.floodFill;
import static com.sov.anik.leetcode.FloodFill733.printMatrix;
import static org.junit.jupiter.api.Assertions.*;

class FloodFill733Test {

    @Test
    public void imageTest() {
        int [][] a = new int [][]{ {1,1,1}, {1,1,0}, {1, 0,1}};
        printMatrix(a);
        int [][] b = floodFill(a, 1, 1, 2);
        printMatrix(b);
    }


    @Test
    public void image2Test() {
        int [][] a = new int [][]{ {0,0,0}, {0,0,0}};
        printMatrix(a);
        int [][] b = floodFill(a, 0, 0, 2);
        printMatrix(b);
    }


    @Test
    public void imageOutTest() {
        int [][] a = new int [][]{ {0,0,0}, {0,1,0}};
        printMatrix(a);
        int [][] b = floodFill(a, 1, 1, 2);
        printMatrix(b);
    }

    @Test
    public void imageSameTest() {
        int [][] a = new int [][]{ {0,0,0}, {0,1,1}};
        printMatrix(a);
        int [][] b = floodFill(a, 1, 1, 1);
        printMatrix(b);
    }

    @Test
    public void imageNextTest() {
        int [][] a = new int [][]{ {1,1,1}, {1,1,0}, {1, 0,1}};
        printMatrix(a);
        int [][] b = floodFill(a, 1, 1, 2);
        printMatrix(b);
    }
}