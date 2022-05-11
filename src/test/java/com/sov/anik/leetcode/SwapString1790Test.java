package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SwapString1790Test {

    @Test
    public void myTest(){
        SwapString1790 swapString1790 = new SwapString1790();
        boolean result = swapString1790.areAlmostEqual("bank", "knab");
        String s = new String("G()()(al)");
        String k = s.replaceAll("\\(al\\)", "al");
        String l = k.replaceAll("\\(\\)", "o");
        assertEquals(l, "Gooal");
        assertEquals(result, true);
    }

}