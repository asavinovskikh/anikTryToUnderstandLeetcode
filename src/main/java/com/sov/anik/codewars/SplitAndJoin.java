package com.sov.anik.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SplitAndJoin {

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return null;
        }
        List<String> c = new ArrayList<>();
        c = Arrays.asList(phrase.split(" "));
        return c.stream().map(x -> x.substring(0, 1).toUpperCase() + x.substring(1)).collect(Collectors.joining(" "));
    }

}