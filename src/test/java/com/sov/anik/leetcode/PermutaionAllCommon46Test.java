package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static com.sov.anik.leetcode.PermutaionAllCommon46.permute;
import static org.junit.jupiter.api.Assertions.*;

class PermutaionAllCommon46Test {

    @Test
    void permuteTest() {
        int [] a = new int [] {1,2,3};
        assertEquals(6, permute(a).size());


    }
}