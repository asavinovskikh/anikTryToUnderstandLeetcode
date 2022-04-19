package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static com.sov.anik.leetcode.LetterCasePermutation784.letterCasePermutation;
import static org.junit.jupiter.api.Assertions.*;

class LetterCasePermutation784Test {

    @Test
    public void letterSimpleTest() {
        List<String> result = letterCasePermutation("a1b2");

        for(String s : result) {
            System.out.println(s);
        }
    }


    @Test
    public void letterSimple2Test() {
        List<String> result = letterCasePermutation("3z4");

        for(String s : result) {
            System.out.println(s);
        }
    }
}