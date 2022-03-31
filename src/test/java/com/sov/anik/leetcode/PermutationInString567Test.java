package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static com.sov.anik.leetcode.PermutationInString567.permutation;
import static org.junit.jupiter.api.Assertions.*;

class PermutationInString567Test {

    @Test
    public void PermutationTest(){
        //проверка что надо начинать не с текущего зафейленного
        assertEquals(permutation("dcda", "adc"), true);
        //оказывается нам еще не важно в каком это порядке
        assertEquals(permutation("adc", "dcda"), true);
        //буквы есть но в произвольном порядке
        assertEquals(permutation("qwert", "rew"), true);
        assertEquals(permutation("eidbaooo", "ab"), true);
        assertEquals(permutation("skirt", "rps"), false);
        assertEquals(permutation("qwert", "qwrt"), false);
        //проверка если в слове есть дубли
        assertEquals(permutation("oooolleoooleh", "hello"), false);
    }
}