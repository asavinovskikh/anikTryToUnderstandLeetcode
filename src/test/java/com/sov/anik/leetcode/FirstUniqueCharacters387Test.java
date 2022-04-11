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
}