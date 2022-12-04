package com.sov.anik.advent0fC0de;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FourthElves {

    public static void main(String[] args) {
        FourthElves s = new FourthElves();
        try {
            s.calc();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public int calc() throws IOException {
        List<Integer> list = new ArrayList<>();
        List<String> str = new ArrayList<>();
        int max = 0;

        BufferedReader reader = new BufferedReader(new FileReader("D:\\Kaggle\\input4.txt"));

        String currentLine = null;
        int summ = 0;

        while ((currentLine = reader.readLine()) != null) {
            currentLine.trim();
            //summ += getInfo(currentLine);
            summ += getIntersection(currentLine);
        }
        reader.close();
        System.out.println(summ);
        return summ;
    }

    private int getInfo(String currentLine) {
        //8-41,8-79
        //Вложения
        //569 answer

        int a;
        int b;
        int c;
        int d;
        String[] line = currentLine.split("-|,");
        a = Integer.valueOf(line[0]);
        b = Integer.valueOf(line[1]);
        c = Integer.valueOf(line[2]);
        d = Integer.valueOf(line[3]);

        if (a <= c && b >= d || a >= c && b <= d) {
            return 1;
        } else {
            return 0;
        }

    }

    private int getIntersection(String currentLine) {
        //8-41,8-79
        //Пересечения
        int a;
        int b;
        int c;
        int d;
        String[] line = currentLine.split("-|,");
        a = Integer.valueOf(line[0]);
        b = Integer.valueOf(line[1]);
        c = Integer.valueOf(line[2]);
        d = Integer.valueOf(line[3]);

        if (a <= c && c <= b || a <= d && d <= b || a <=c && b >= d || a >=c && b <=d) {
            System.out.println(1 + " " + a + " " + b + " " + c + " " + d);
            return 1;
        } else {
            System.out.println(0 + " " + a + " " + b + " " + c + " " + d);
            return 0;
        }

    }
}
