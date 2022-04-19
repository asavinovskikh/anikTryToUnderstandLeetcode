package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static com.sov.anik.leetcode.FirstUniqueCharacters387.firstUniqueChar;
import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueCharacters387Test {

    @Test
    void firstUniqueCharTest() {

        String tests = new String("leetcode");
        assertEquals(0, firstUniqueChar(tests));
    }

    @Test
    void firstUniqueTest() {

        String tests = new String("loveleetcode");
        assertEquals(2, firstUniqueChar(tests));
    }

    @Test
    void negativeTest() {

        String tests = new String("aabb");
        assertEquals(-1, firstUniqueChar(tests));
    }
}