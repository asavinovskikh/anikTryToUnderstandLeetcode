package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayOfPermutation1920Test {
    @Test
    public void myFirstTest(){
        BuildArrayOfPermutation1920 ba = new BuildArrayOfPermutation1920();
        int [] o = new int [] {0,1,2,3,4,5};
        int [] a = new int [] {0,2,1,5,3,4};
        int [] b = new int [] {0,1,2,4,5,3};
        int [] c = ba.buildArray(a);
        for(int i =0; i < a.length; i++) {
            assertEquals(c[i], b[i]);
        }
    }

}