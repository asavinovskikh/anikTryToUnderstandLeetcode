package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberStepsOfReducetoZero1342Test {
    @Test
    public void myTest() {
        NumberStepsOfReducetoZero1342 n = new NumberStepsOfReducetoZero1342();
        assertEquals(6,n.numberOfSteps(14));
    }

    @Test
    public void my2Test() {
        NumberStepsOfReducetoZero1342 n = new NumberStepsOfReducetoZero1342();
        assertEquals(4,n.numberOfSteps(8));
    }

    @Test
    public void myBigTest() {
        NumberStepsOfReducetoZero1342 n = new NumberStepsOfReducetoZero1342();
        assertEquals(12,n.numberOfSteps(123));
    }

}