package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static com.sov.anik.leetcode.SumOfRootToLeaf1022.getIntFromArray;
import static org.junit.jupiter.api.Assertions.*;

class SumOfRootToLeaf1022Test {
    @Test
    public void someArrayToIntBinaryTest () {
        int [] arbinary = new int [] {1, 0, 0};
        assertEquals(4,getIntFromArray(arbinary));
    }

    @Test
    public void someArrayToInt2BinaryTest () {
        int [] arbinary = new int [] {1, 0, 1};
        assertEquals(5,getIntFromArray(arbinary));
    }

    @Test
    public void someArrayToInt3BinaryTest () {
        int [] arbinary = new int [] {1, 1, 1};
        assertEquals(7,getIntFromArray(arbinary));
    }

}