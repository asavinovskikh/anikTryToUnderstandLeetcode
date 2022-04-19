package com.sov.anik.leetcode;

public class FloodFill733 {
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int currColor = image[sr][sc];
        if (currColor == newColor) {
            return image;
        }
        int maxH = image.length;
        int maxV = image[0].length;
        image[sr][sc] = newColor;
        paintNeib(image, sr, sc, currColor, newColor, maxH, maxV);
        return image;
    }

    public static void paintNeib(int[][] image, int sr, int sc,
                                 int CurrColor, int newColor,
                                 int maxHorizontal, int maxVertical) {
        if (sr+1 < maxHorizontal && image[sr+1][sc] == CurrColor) {
            image[sr+1][sc] = newColor;
            paintNeib(image, sr+1, sc, CurrColor, newColor,maxHorizontal, maxVertical);
        }
        if (sr-1 >= 0 && image[sr-1][sc] == CurrColor) {
            image[sr-1][sc] = newColor;
            paintNeib(image, sr-1, sc, CurrColor, newColor,maxHorizontal, maxVertical);
        }

        if (sc+1 < maxVertical && image[sr][sc+1] == CurrColor) {
            image[sr][sc+1] = newColor;
            paintNeib(image, sr, sc+1, CurrColor, newColor,maxHorizontal, maxVertical);
        }
        if (sc-1 >= 0 && image[sr][sc-1] == CurrColor) {
            image[sr][sc-1] = newColor;
            paintNeib(image, sr, sc-1, CurrColor, newColor,maxHorizontal, maxVertical);
        }
    }

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
}
