package com.sov.anik.Leetcode3;

import java.util.*;

import static com.sov.anik.leetcode.Utils.printMatrix;

public class ErectTheFence587 {
    public int[][] outerTrees(int[][] trees) {
        int minx = 0;
        int miny = 0;
        int maxx = 0;
        int maxy = 0;

        int n = trees.length;
        int k = trees[0].length;
        Set<Coordinates> mymap = new HashSet();
        for(int i = 0; i < n; i++) {
            for(int j = 0 ; j < k; j++) {
                if (trees[i][j] == 1) {
                    mymap.add(new Coordinates(i,j));
                }
            }
        }
        for(Coordinates el : mymap) {
            if (el.getX() > maxx) {
                maxx = el.getX();
            }
            if (el.getX() > maxx) {
                maxx = el.getX();
            }
            if (el.getX() > maxx) {
                maxx = el.getX();
            }
            if (el.getX() > maxx) {
                maxx = el.getX();
            }
        }
        return trees;
    }

    public static void main(String[] args) {
        int [][] a = new int [5][5];
        a[1][1] = 1;
        a[2][2] = 1;
        a[2][0] = 1;
        a[2][4] = 1;
        a[3][3] = 1;
        a[4][2] = 1;

        int [][] c = new int [5][5];
        ErectTheFence587 e = new ErectTheFence587();
        c = e.outerTrees(a);

        printMatrix(c);
    }

    class Coordinates{
        int x;
        int y;
        Coordinates(int a, int b) {
            x = a;
            y = b;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Coordinates)) return false;
            Coordinates that = (Coordinates) o;
            return getX() == that.getX() &&
                    getY() == that.getY();
        }

        @Override
        public int hashCode() {
            return Objects.hash(getX(), getY());
        }
    }
}
