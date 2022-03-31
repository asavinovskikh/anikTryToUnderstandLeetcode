package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static com.sov.anik.leetcode.ClimbingStairs70.climbStairs;
import static com.sov.anik.leetcode.ClimbingStairs70.climbStairsFast;
import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairs70Test {

    @Test
    public void check2(){
        assertEquals(2, climbStairs(2));
    }

    @Test
    public void check3(){
        assertEquals(3, climbStairs(3));
    }

    @Test
    public void checkFast2(){
        assertEquals(2, climbStairsFast(2));
    }

    @Test
    public void check3Fast(){
        assertEquals(3, climbStairsFast(3));
    }
}