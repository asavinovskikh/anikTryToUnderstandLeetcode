package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static com.sov.anik.leetcode.PermutationInString567.permutation;
import static org.junit.jupiter.api.Assertions.*;

class PermutationInString567Test {

    @Test
    public void PermutationTest(){
        assertEquals(permutation("dcda", "adc"), true);
        assertEquals(permutation("qwert", "rew"), true);
        assertEquals(permutation("eidbaooo", "ab"), true);
        assertEquals(permutation("skirt", "rps"), false);
        assertEquals(permutation("qwert", "qwrt"), false);
    }
}