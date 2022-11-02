package com.sov.anik.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListPreparation {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> al = (Arrays.stream(a)).boxed().collect(Collectors.toList());
        IntStream bl = Arrays.stream(b);
        List<Integer> br = bl.boxed().collect(Collectors.toList());
        return al.stream().filter(item -> !br.contains(item)).mapToInt(Integer::intValue).toArray();
    }

    public static int find(int[] array, int value) {
        for(int i=0; i<array.length; i++)
            if(array[i] == value)
                return i;
        return -1;
    }
}
