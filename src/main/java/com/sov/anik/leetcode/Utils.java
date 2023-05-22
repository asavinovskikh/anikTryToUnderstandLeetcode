package com.sov.anik.leetcode;

import java.util.List;
import java.util.Map;

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

    public static void printMap ( Map <Integer, Integer> mapa) {
        mapa.entrySet().forEach(it -> System.out.println(it.getKey() + " " + it.getValue()));
    }

    public static void printMapList ( Map <Integer, List<Integer>> mapa) {
        mapa.entrySet().forEach(it -> System.out.println(it.getKey() + " " + Utils.List2String(it.getValue())));
    }

    public <T> void printList(List<T> list){
        for (T it: list) {
            System.out.print("" + it.toString() + " ");
        }
        System.out.println("\n");
    }

    public static String List2String(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        for(Integer l : list) {
            sb.append(l + " ");
        }
        return sb.toString();
    }


    public static <T> void printArray(T [] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print("" + a[i] + " ");
        }
        System.out.println("\n");
    }

    public static void printArray(int [] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print("" + a[i] + " ");
        }
        System.out.println("\n");
    }
}
