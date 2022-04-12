package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static com.sov.anik.leetcode.MaxMultiply2233.maximumProduct;
import static org.junit.jupiter.api.Assertions.*;

class MaxMultiply2233Test {

    @Test
    void maximumProductTest() {
        int [] a = new int [] {6, 3, 3,2};
        assertEquals(216, maximumProduct(a,2));
    }


    @Test
    void maximumlongProductTest() {
        int [] a = new int [] {92,36,15,84,57,60,72,86,70,43,16};
        assertEquals(800222867, maximumProduct(a,62));
    }
}