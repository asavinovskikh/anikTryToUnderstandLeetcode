package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sov.anik.leetcode.Triangle120.minimumTotal;
import static com.sov.anik.leetcode.Triangle120.minimumm;
import static org.junit.Assert.assertEquals;

class Triangle120Test {

    @Test
    public void testTriangle () {
        List<List<Integer>> triangle = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2));
        List<Integer> b = new ArrayList(Arrays.asList(3, 4));
        List<Integer> c = new ArrayList(Arrays.asList(6,5,7));
        List<Integer> d = new ArrayList(Arrays.asList(4,1,8,3));
        triangle.add(0, a);
        triangle.add(1, b);
        triangle.add(2, c);
        triangle.add(3, d);

        assertEquals(11, minimumTotal(triangle));
    }

    @Test
    public void testBigNegative() {
        List<List<Integer>> triangle = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(-7));
        List<Integer> b = new ArrayList(Arrays.asList(-2, 1));
        List<Integer> c = new ArrayList(Arrays.asList(-5,-5,9));
        List<Integer> d = new ArrayList(Arrays.asList(-4,-5,4,4));
        List<Integer> e = new ArrayList(Arrays.asList(-6,-6,2,-1,-5));
        List<Integer> f = new ArrayList(Arrays.asList(3,7,8,-3,7,-9));
        List<Integer> g = new ArrayList(Arrays.asList(-9,-1,-9,6,9,0,7));
        List<Integer> h = new ArrayList(Arrays.asList(-7,0,-6,-8,7,1,-4,9));
        List<Integer> i = new ArrayList(Arrays.asList(-3,2,-6,-9,-7,-6,-9,4,0));
        List<Integer> j = new ArrayList(Arrays.asList(-8,-6,-3,-9,-2,-6,7,-5,0,7));
        List<Integer> k = new ArrayList(Arrays.asList(-9,-1,-2,4,-2,4,4,-1,2,-5,5));
        List<Integer> l = new ArrayList(Arrays.asList(1,1,-6,1,-2,-4,4,-2,6,-6,0,6));
        List<Integer> m = new ArrayList(Arrays.asList(-3,-3,-6,-2,-6,-2,7,-9,-5,-7,-5,5,1));
        triangle.add(0, a);
        triangle.add(1, b);
        triangle.add(2, c);
        triangle.add(3, d);
        triangle.add(4, e);
        triangle.add(5, f);
        triangle.add(6, g);
        triangle.add(7, h);
        triangle.add(8, i);
        triangle.add(9, j);
        triangle.add(10, k);
        triangle.add(11, l);
        triangle.add(12, m);

        assertEquals(-63, minimumTotal(triangle));

    }


    @Test
    public void veryBigTest() {
        List<List<Integer>> triangle = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(-1));
        List<Integer> b = new ArrayList(Arrays.asList(9,-2));
        List<Integer> c = new ArrayList(Arrays.asList(0,4,5));
        List<Integer> d = new ArrayList(Arrays.asList(7,4,-4,-5));
        List<Integer> e = new ArrayList(Arrays.asList(9,6,0,5,7));
        List<Integer> f = new ArrayList(Arrays.asList(9,2,-9,-4,5,-2));
        List<Integer> g = new ArrayList(Arrays.asList(-4,-9,-5,-7,-5,-5,-2));
        List<Integer> h = new ArrayList(Arrays.asList(-9,5,-6,-4,4,1,6,-4));
        List<Integer> i = new ArrayList(Arrays.asList(-4,3,9,-2,8,6,-9,-2,-2));
        List<Integer> j = new ArrayList(Arrays.asList(7,-6,9,8,-4,2,-4,-2,-1,-2));
        List<Integer> k = new ArrayList(Arrays.asList(0,3,2,4,0,-6,7,6,7,-5,2));
        List<Integer> l = new ArrayList(Arrays.asList(9,0,-8,6,4,6,2,5,-9,9,-1,-6));
        List<Integer> m = new ArrayList(Arrays.asList(6,-3,-4,-5,0,3,3,4,-6,-4,-7,7,3));
        triangle.add(0, a);
        triangle.add(1, b);
        triangle.add(2, c);
        triangle.add(3, d);
        triangle.add(4, e);
        triangle.add(5, f);
        triangle.add(6, g);
        triangle.add(7, h);
        triangle.add(8, i);
        triangle.add(9, j);
        triangle.add(10, k);
        triangle.add(11, l);
        triangle.add(12, m);


        assertEquals(-33, minimumm(triangle));
    }

}