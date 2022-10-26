package com.sov.anik.leetcode;

import java.util.List;

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

    //useful for iterate for all 4 sides
    public int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public <T> void printList(List<T> list){
        for (T it: list) {
            System.out.print("" + it.toString() + " ");
        }
        System.out.println("\n");
    }
}
