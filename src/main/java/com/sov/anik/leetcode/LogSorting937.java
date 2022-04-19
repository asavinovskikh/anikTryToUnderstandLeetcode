package com.sov.anik.leetcode;

import java.util.*;

public class LogSorting937 {

//    https://leetcode.com/problems/reorder-data-in-log-files/
    public static String[] reorderLogFiles(String[] logs) {
        Map<String, String> myTextMap = new HashMap<String, String>();
        List<String> myText = new ArrayList<>();
        List<String> myDigit = new ArrayList<>();
        for (int i = 0; i < logs.length; i++) {
            String curr = logs[i];
            int index = curr.indexOf(" ");
            String sub = curr.substring(0, index);
            String remainder = curr.substring(index);
            if (sub.startsWith("dig")) {
                myDigit.add(logs[i]);
            } else {
                myTextMap.put(remainder, sub);
                myText.add(remainder);
            }
        }
        List<String> result = new ArrayList<String>();

        Collections.sort(myText);

        for(int i = 0; i < myText.size(); i++) {
            String value = myText.get(i);
            result.add(myTextMap.get(value) + value);
        }
        result.addAll(myDigit);

        return result.stream().toArray(String[]::new);
    }
}
