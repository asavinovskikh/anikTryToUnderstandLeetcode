package com.sov.anik.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ListPreparation {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> al = Arrays.stream(a).boxed().toList();
        List<Integer> bl = Arrays.stream(b).boxed().toList();
        return al.stream().filter(item -> !bl.contains(item)).mapToInt(Integer::intValue).toArray();
    }

    public static int find(int[] array, int value) {
        for(int i=0; i<array.length; i++)
            if(array[i] == value)
                return i;
        return -1;
    }
}
