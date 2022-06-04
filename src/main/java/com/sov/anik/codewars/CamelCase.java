package com.sov.anik.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCase {
    public static String camelCase(String input) {
        String[] c = input.split(" ");
        return Arrays.stream(c).map(CamelCase::transformToFirstUp).collect(Collectors.joining());
    }

    public static String transformToFirstUp(String s) {
        if (s == null) {
            return "";
        }
        if (s.length() < 2) {
            return s.toUpperCase();
        }
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }
}
