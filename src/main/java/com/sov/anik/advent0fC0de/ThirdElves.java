package com.sov.anik.advent0fC0de;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class ThirdElves {


    public static void main(String[] args) {
        ThirdElves s = new ThirdElves();
//        s.getValueByChar('a');
//        s.getValueByChar('z');
//        s.getValueByChar('A');
//        s.getValueByChar('Z');


//        s.findChar("pplla", "ffrra");

//first 7908
//second no2713
//second no2713

        try {
            s.calculation2();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int calculation() throws IOException {
        List<Integer> list = new ArrayList<>();
        List<String> str = new ArrayList<>();
        int max = 0;

        //BufferedReader reader = new BufferedReader(new FileReader("D:\\Kaggle\\input3.txt"));
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Kaggle\\input3.txt"));

        String currentLine = null;
        int summ = 0;

        while ((currentLine = reader.readLine()) != null) {
            currentLine.trim();
            int len = currentLine.length();
            String s1 = currentLine.substring(0, len/2);
            String s2 = currentLine.substring(len/2);
            char a  = findChar(s1, s2);
            System.out.println(a);
            int value = getValueByChar(a);
            summ += value;

        }
        reader.close();
        System.out.println(summ);

        return summ;
    }


    public int calculation2() throws IOException {
        List<Integer> list = new ArrayList<>();
        List<String> str = new ArrayList<>();
        int max = 0;

//        BufferedReader reader = new BufferedReader(new FileReader("D:\\Kaggle\\input3.txt"));
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Kaggle\\input3.txt"));
        String currentLine = null;

        int summ = 0;

        String [] three = new String[3];
        int count = 0;
        int allcount= 0;
        int count3 = 0;

        while ((currentLine = reader.readLine()) != null) {
            currentLine.trim();
            if (count == 0) {
                three[0] = currentLine;
                count++;
            } else {
                if (count == 1) {
                    three[1] = currentLine;
                    count++;
                } else {
                    if (count == 2) {
                        three[2] = currentLine;
                        char ab  = findAnotherChar(three[0], three[1], three[2]);
                        int value = getValueByChar(ab);
                        int currsum = summ;
                        count3++;
                        summ += value;
                        count = 0;
                        System.out.println(ab + " " + value + " + " + currsum + " = " + summ);
                    }
                }
            }
            allcount ++;
        }
        reader.lines();

        System.out.println(allcount + " " + count3 + " " + summ);
        return summ;
    }

    public static String removeCHAR(String str, char p) {
        char [] ss = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < ss.length; i++) {
            if (ss[i] != p) {
                sb.append(ss[i]);
            }
        }
        return sb.toString();
    }

    public char findChar(String s1, String s2) {
        char [] a = s1.toCharArray();
        char [] b = s2.toCharArray();
        for(int i = 0; i < a.length; i++) {
            if (s2.indexOf(a[i]) > -1) {
               return a[i];
            }
        }
        return ' ';
    }


    public char findAnotherChar(String s1, String s2, String s3) {
        int index = -1;
        HashSet<Character> setOfCharacter = new HashSet<Character>();
        int n = s1.length();
        for(char ch : s1.toCharArray()) {
            setOfCharacter.add(Character.valueOf(ch));
        }

        n = s2.length();
        for(char ch : s2.toCharArray()) {
            setOfCharacter.add(Character.valueOf(ch));
        }

        n = s3.length();
        for(char ch : s3.toCharArray()) {
            setOfCharacter.add(Character.valueOf(ch));
        }

        Iterator<Character> iterate_value = setOfCharacter.iterator();

        char result = '/';
        while(iterate_value.hasNext()) {
            Character c = iterate_value.next();
            System.out.println(c);
            int k = s1.indexOf(c);
            int l = s2.indexOf(c);
            int m = s3.indexOf(c);
            if (k > -1 && l > -1 && m > -1){
                result = c;
            }
        }

       // System.out.println("RESULT " + result + " " + s1 + " " + s2 + " " + s3);
        return result;
    }

    public char find3Char(String s1, String s2, String s3) {
        HashSet<Character> h1 = new HashSet<Character>();
        HashSet<Character> h2 = new HashSet<Character>();

        for(int i = 0; i < s1.length(); i++)
        {
            h1.add(s1.charAt(i));
        }
        for(int i = 0; i < s2.length(); i++)
        {
            h2.add(s2.charAt(i));
        }
        h1.retainAll(h2);

        Character[] result = h1.toArray(new Character[0]);

        char ress = findChar(result.toString(), s3);
        //System.out.println("RESULT " + ress + " " + s1 + " " + s2 + " " + s3);
        return ress;
    }

    public int getValueByChar(char a) {
        int val = a;
        if (val > 90) {
            val -= 96;
        } else {
            val -= 65;
            val += 27;
        }
        //System.out.println(val);
        return val;
    }

}
