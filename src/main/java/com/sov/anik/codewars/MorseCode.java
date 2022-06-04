package com.sov.anik.codewars;

import java.util.Arrays;

public class MorseCode {
    public static String decode(String encodedText){
        String[] morse = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder result = new StringBuilder();
        String [] encodedList = encodedText.split(" ");
        for(String itemElement : encodedList) {
            //result.append((char)(Arrays.asList(morse).indexOf(itemElement)+'a'));
            char rr = (char)(Arrays.asList(morse).indexOf(itemElement));
        }
        return result.toString();
    }
}
