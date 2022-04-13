package com.sov.anik.leetcode;

import static java.lang.Integer.max;

public class UpdateMatrix542 {
//Given an m x n binary matrix mat,
//return the distance of the nearest 0 for each cell
//The distance between two adjacent cells is 1

    public static int[][] updateMatrix(int[][] mat) {
        //return updateSBSMatrix(mat);
        return updateMatrixFrom0ToN(mat);
    }

    public static int[][] updateMatrixFrom0ToN(int[][] mat) {
        int maxH = mat.length;
        int maxV = mat[0].length;
        for (int i = 0; i < maxH; i++) {
            for (int j = 0; j < maxV; j++) {
                if (mat[i][j] == 0) {
                    if (i+1 < maxH) {
                        if (mat[i+1][j] > 0) {
                            mat[i+1][j] = -1;
                        }
                    }
                    if (i-1 > 0) {
                        if (mat[i-1][j] > 0) {
                            mat[i-1][j] = -1;
                        }
                    }
                    if (j+1 < maxV) {
                        if (mat[i][j+1] > 0) {
                            mat[i][j+1] = -1;
                        }
                    }
                    if (j-1 < maxV) {
                        if (mat[i][j-1] > 0) {
                            mat[i][j-1] = -1;
                        }
                    }
                }
            }
        }
        return mat;
    }

    public static int[][] stupdateSBSMatrix(int[][] mat) {
        int maxH = mat.length;
        int maxV = mat[0].length;
        for (int k = 0; k < max(maxH, maxV); k++) {
            for(int i = 0; i < maxH; i++) {
                for (int j = 0; j < maxV; j++) {
                    if (mat[i][j] != 0) {
                        int result = minSimpleOfNeib(mat, i, j, maxH, maxV);
                        mat[i][j] = result + 1;
                    }

                }
            }
        }
        return mat;
    }

    public static int[][] updateSBSMatrix(int[][] mat) {
        int maxH = mat.length;
        int maxV = mat[0].length;
        for(int i = 0; i < maxH; i++) {
            for (int j = 0; j < maxV; j++) {
                if (mat[i][j] != 0) {
                    int result = minOfNeib(mat, i, j, maxH, maxV);
                    mat[i][j] = result + 1;
                }

            }
        }
        return mat;
    }

    public static int minSimpleOfNeib(int[][] image, int sr, int sc,
                                int maxHorizontal, int maxVertical) {
        int m = minOfNeibI(image, sr, sc, maxHorizontal, maxVertical);
        int n = minOfNeibII(image, sr, sc, maxHorizontal, maxVertical);
        int l = minOfNeibIII(image, sr, sc, maxHorizontal, maxVertical);
        int k = minOfNeibIV(image, sr, sc, maxHorizontal, maxVertical);
        return Math.min(Math.min(m,n), Math.min(l,k));
    }


    public static int minOfNeib(int[][] image, int sr, int sc,
                          int maxHorizontal, int maxVertical) {
        int m = minOfNeibI(image, sr, sc, maxHorizontal, maxVertical);
        int n = minOfNeibII(image, sr, sc, maxHorizontal, maxVertical);
        int l = minOfNeibIII(image, sr, sc, maxHorizontal, maxVertical);
        int k = minOfNeibIV(image, sr, sc, maxHorizontal, maxVertical);
        return Math.min(Math.min(m,n), Math.min(l,k));
}


    public static int minOfNeibI(int[][] image, int sr, int sc,
                                int maxHorizontal, int maxVertical) {
        int m = Integer.MAX_VALUE;
        int k = Integer.MAX_VALUE;
        if (sr+1 < maxHorizontal) {
            if (image[sr+1][sc] > 0) {
                int result = minOfNeibI(image,  sr+1, sc, maxHorizontal, maxVertical);
                m = result < Integer.MAX_VALUE? (result + 1) : result;
            } else {
                m = 0;
            }
        }
        if (sc-1 >= 0) {
            if (image[sr][sc-1] >0) {
                int result = minOfNeibI(image,  sr, sc-1, maxHorizontal, maxVertical);
                k = result< Integer.MAX_VALUE? (result + 1) : result;
            } else {
                k = 0;
            }
        }
        return Math.min(m,k);
    }
    public static int minOfNeibII(int[][] image, int sr, int sc,
                                 int maxHorizontal, int maxVertical) {
        int m = Integer.MAX_VALUE;
        int n = Integer.MAX_VALUE;
        if (sr+1 < maxHorizontal) {
            if (image[sr+1][sc] > 0) {
                int result = minOfNeibII(image,  sr+1, sc, maxHorizontal, maxVertical);
                m = result< Integer.MAX_VALUE? (result + 1) : result;
            } else {
                m = 0;
            }
        }

        if (sc+1 < maxVertical) {
            if (image[sr][sc+1] >0) {
                int result = minOfNeibII(image,  sr, sc+1, maxHorizontal, maxVertical);
                n = result < Integer.MAX_VALUE? (result + 1) : result;
            } else {
                n = 0;
            }
        }
        return Math.min(m,n);
    }
    public static int minOfNeibIII(int[][] image, int sr, int sc,
                                 int maxHorizontal, int maxVertical) {
        int l = Integer.MAX_VALUE;
        int n = Integer.MAX_VALUE;

        if (sr-1 >= 0) {
            if (image[sr-1][sc] >0) {
                int result = minOfNeibIII(image,  sr-1, sc, maxHorizontal, maxVertical);
                l = result < Integer.MAX_VALUE? (result + 1) : result;
            } else {
                l = 0;
            }
        }
        if (sc+1 < maxVertical) {
            if (image[sr][sc+1] >0) {
                int result = minOfNeibIII(image,  sr, sc+1, maxHorizontal, maxVertical);
                n = result < Integer.MAX_VALUE? (result + 1) : result;
            } else {
                n = 0;
            }
        }

        return Math.min(l,n);
    }
    public static int minOfNeibIV(int[][] image, int sr, int sc,
                                 int maxHorizontal, int maxVertical) {
        int l = Integer.MAX_VALUE;
        int k = Integer.MAX_VALUE;

        if (sr-1 >= 0) {
            if (image[sr-1][sc] >0) {
                int result = minOfNeibIV(image,  sr-1, sc, maxHorizontal, maxVertical);
                l = result < Integer.MAX_VALUE? (result + 1) : result;
            } else {
                l = 0;
            }
        }

        if (sc-1 >= 0) {
            if (image[sr][sc-1] >0) {
                int result = minOfNeibIV(image,  sr, sc-1, maxHorizontal, maxVertical);
                k = result < Integer.MAX_VALUE? (result + 1) : result;
            } else {
                k = 0;
            }
        }

        return Math.min(l,k);
    }

}
