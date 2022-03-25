package com.sov.anik.leetcode;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RobberStrategy198Test {

    @Test
    public void myTest() {
        //RobberStrategy198
        int [] arr = new int []{2,7,11,15};
        assertEquals(22, RobberStrategy198.rob(arr));

        arr = new int []{1,2,3,1};
        assertEquals(4, RobberStrategy198.rob(arr));

        arr = new int []{2,1,1,2};
        assertEquals(4, RobberStrategy198.rob(arr));

    }

    @Test
    public void longTest() {
        int [] arr = new int []
                {114,117,207,117,235,82,90,67,143,146,53,108,200,91,80,223,58,170,
                110,236,81,90,222,160,165,195,187,199,114,235,197,187,69,129,64,214,228,
                        78,188,67,205,94,205,169,241,202,144,240};

        Instant start = Instant.now();
        // выполнение какой-то логики
        //int s = RobberStrategy198.rob(arr);
        int s = RobberStrategy198.robFirst(arr);

        Instant finish = Instant.now();
        long elapsed = Duration.between(start, finish).toMillis();
        //System.out.println(String.format("результат {} Прошло времени, мс: {}", s, elapsed));
        System.out.println(String.format("результат" + s + " Прошло времени, мс" + elapsed));

    }


    @Test
    public void veryLongTest() {
        int [] arr = new int []
                {226,174,214,16,218,48,153,131,128,17,157,142,88,43,37,157,43,221,191,68,206,23,225,82,54,118,111,46,80,
                        49,245,63,25,194,72,80,143,55,209,18,55,122,65,66,177,101,63,201,172,130,103,225,142,46,86,185,
                        62,138,212,192,125,77,223,188,99,228,90,25,193,211,84,239,119,234,85,83,123,120,131,203,219,10,
                        82,35,120,180,249,106,37,169,225,54,103,55,166,124};


        Instant start = Instant.now();
        // выполнение какой-то логики
        int s = RobberStrategy198.robFirst(arr);

        Instant finish = Instant.now();
        long elapsed = Duration.between(start, finish).toMillis();
        //System.out.println(String.format("результат {} Прошло времени, мс: {}", s, elapsed));
        System.out.println(String.format("результат" + s + " Прошло времени, мс" + elapsed));

    }

}