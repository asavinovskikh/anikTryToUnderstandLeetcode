package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import static com.sov.anik.leetcode.LogSorting937.reorderLogFiles;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LogSorting937Test {

    @Test
    public void checkTest(){
        String [] a = new String [] {"dig1 8 1 5 1",
                "let1 art can","dig2 3 6",
                "let2 own kit dig","let3 art zero"};
        String [] b = new String [] {"let1 art can","let3 art zero","let2 own kit dig",
                "dig1 8 1 5 1","dig2 3 6"};
        String [] c = reorderLogFiles(a);
        //assertEquals( reorderLogFiles(a), b);
        for(int i = 0; i < a.length; i++) {
            assertEquals( c[i], b[i]);
        }

    }

}