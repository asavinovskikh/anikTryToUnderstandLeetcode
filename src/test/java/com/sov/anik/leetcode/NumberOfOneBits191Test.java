package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static com.sov.anik.leetcode.NumberOfOneBits191.hammingWeight;
import static org.junit.jupiter.api.Assertions.*;

class NumberOfOneBits191Test {

    @Test
    void firstSumTest() {
        int n = 111111;
        assertEquals(6, hammingWeight(n));
    }

}