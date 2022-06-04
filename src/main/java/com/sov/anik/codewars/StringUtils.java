package com.sov.anik.codewars;

public class StringUtils {
    public String masking(String textForMasking, char symbol, int lost) {
        int amount = textForMasking.length();
        int rest = amount - lost;
        if (rest > 0) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < rest; i++) {
                sb.append(symbol);
            }
            sb.append(textForMasking.substring(rest));
            return sb.toString();
        }
        return textForMasking;
    }
}
