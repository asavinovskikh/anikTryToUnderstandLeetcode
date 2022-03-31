package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sov.anik.leetcode.Triangle120.minimumTotal;
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

}