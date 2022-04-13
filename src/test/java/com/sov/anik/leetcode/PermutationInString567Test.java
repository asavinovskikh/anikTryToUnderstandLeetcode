package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static com.sov.anik.leetcode.PermutationInString567.permutation;
import static org.junit.jupiter.api.Assertions.*;

class PermutationInString567Test {

    @Test
    public void PermutationTest(){
        //проверка что надо начинать не с текущего зафейленного
      //  assertEquals(permutation("dcda", "adc"), false);
        //оказывается нам еще не важно в каком это порядке
       // assertEquals(permutation("adc", "dcda"), true);
        //буквы есть но в произвольном порядке
     //   assertEquals(permutation("rew", "qwert"), true);
        assertEquals(permutation("ab", "eidbaooo"), true);
     //   assertEquals(permutation("rps", "skirt"), false);
     //   assertEquals(permutation("qwrt", "qwert"), false);
        //проверка если в слове есть дубли
     //   assertEquals(permutation("hello", "oooolleoooleh"), false);
    }
}