package com.sov.anik.advent0fC0de;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondElves {

    public static void main(String[] args) throws IOException {
        SecondElves s = new SecondElves();
        s.calculation();

    }

    public int calculation() throws IOException {
        List<Integer> list = new ArrayList<>();
        List<String> str = new ArrayList<>();
        int max = 0;
        //first step - 8392
        //second 10116
        BufferedReader reader = new BufferedReader(new FileReader("D:\\Kaggle\\input2.txt"));

        String currentLine = null;
        int summ = 0;
        int am = 0;

        while((currentLine = reader.readLine()) != null){
            currentLine.trim();
            String [] curr = currentLine.split(" ");
            if (curr[1].equals("X")) {
                am += 0;
            }
            if (curr[1].equals("Y")) {
                am += 3;
            }
            if (curr[1].equals("Z")) {
                am += 6;
            }
            if (curr[0].equals("A")) {

                if (curr[1].equals("X")) {
                    am += 3;
                }
                if (curr[1].equals("Y")) {
                    am += 1;
                }
                if (curr[1].equals("Z")) {
                    am += 2;
                }
            }

            if (curr[0].equals("B")) {
                if (curr[1].equals("X")) {
                    am += 1;
                }
                if (curr[1].equals("Y")) {
                    am += 2;
                }
                if (curr[1].equals("Z")) {
                    am += 3;
                }
            }


            if (curr[0].equals("C")) {
                if (curr[1].equals("X")) {
                    am += 2;
                }
                if (curr[1].equals("Y")) {
                    am += 3;
                }
                if (curr[1].equals("Z")) {
                    am += 1;
                }
            }
        }

        System.out.println(am);
        return am;
    }
}
