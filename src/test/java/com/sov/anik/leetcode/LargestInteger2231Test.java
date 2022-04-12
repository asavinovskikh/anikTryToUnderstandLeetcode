package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static com.sov.anik.leetcode.LargestInteger2231.anotherLargestInteger;
import static com.sov.anik.leetcode.LargestInteger2231.largestInteger;
import static org.junit.jupiter.api.Assertions.*;

class LargestInteger2231Test {

    @Test
    void largestIntegerTest() {

        assertEquals(3412, largestInteger(1234));
    }

    @Test
    void largestIntegerOtherTest() {

        assertEquals(87655, largestInteger(65875));
    }

    @Test
    void myotherEquals() {
        assertEquals(anotherLargestInteger(65875), largestInteger(65875));
        assertEquals(anotherLargestInteger(1234), largestInteger(1234));
        assertEquals(anotherLargestInteger(247), largestInteger(247));
    }
}