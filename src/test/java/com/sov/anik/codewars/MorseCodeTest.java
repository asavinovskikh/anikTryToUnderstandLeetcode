package com.sov.anik.codewars;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {

        @Test
        public void testExampleFromDescriptionTest() {
            assertEquals(MorseCode.decode(".... . -.--   .--- ..- -.. ."), "HEY JUDE");
        }
}