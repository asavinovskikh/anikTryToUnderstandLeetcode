package com.sov.anik.leetcode2;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class RectangleArea223 {
    public static int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int a1 = max(A, E);
        int a2 = max(B, F);

        int b1 = min(C, G);
        int b2 = min(D, H);

        int len = b1>a1? b1-a1 : a1-b1;
        int high = b2>a2? b2-a2 : a2-b2;

        int S = (C-A) * (D-B) + (G-E) * (H-F) - len*high;
        return S;
    }

    public static void main(String[] args) {
        // ax1 = -3, ay1 = 0, ax2 = 3, ay2 = 4, bx1 = 0, by1 = -1, bx2 = 9, by2 = 2
        System.out.println(computeArea(-3, 0, 3, 4, 0, -1, 9, 2)); //45
    }
}
