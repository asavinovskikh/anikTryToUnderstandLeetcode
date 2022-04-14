package com.sov.anik.leetcode;

public class Utils {
    public static void printMatrix(int[][] image) {
        int maxH = image.length;
        int maxV = image[0].length;

        for(int i = 0; i < maxH; i++) {
            for(int j = 0; j < maxV; j++) {
                System.out.print( image[i][j] + " ");
            }
            System.out.println("\n");
        }

    }

    //полезно итерироваться по всем 4м сторонам
    public int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
}
