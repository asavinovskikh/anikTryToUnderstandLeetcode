package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class RottingOranges994Test {

    @Test
    public void getTest() {

        int [][] a = new int [][] {{2,1,1},{1,1,0},{0,1,1}};
        RottingOranges994 rt = new RottingOranges994();
        assertEquals(4,rt.orangesRotting(a));
    }

    @Test
    public void getNothingTest() {

        int [][] a = new int [][] {{1,1,1},{1,1,0},{0,1,1}};
        RottingOranges994 rt = new RottingOranges994();
        assertEquals(-1,rt.orangesRotting(a));
    }


    @Test
    public void get2NothingTest() {

        int [][] a = new int [][] {{1,1,1},{1,1,0},{0,0,2}};
        RottingOranges994 rt = new RottingOranges994();
        assertEquals(-1,rt.orangesRotting(a));
    }

}