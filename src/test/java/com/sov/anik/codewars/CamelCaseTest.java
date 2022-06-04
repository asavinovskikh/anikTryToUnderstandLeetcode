package com.sov.anik.codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamelCaseTest {
    @Test
    public void gettest() {
        assertEquals("camel case", CamelCase.camelDiffCase("camelCase"));
    }

}