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

public class FirstFoodCalories {

    public int getMax() throws IOException {

            List<Integer> list = new ArrayList<>();
            int max = 0;
            BufferedReader reader = new BufferedReader(new FileReader("D:\\Kaggle\\input.txt"));
//
//        String currentLine = reader.readLine();
//        reader.close();



            String currentLine = null;
            int summ = 0;

            while((currentLine = reader.readLine()) != null){//while there is content on the current line
                currentLine.trim();
                if (currentLine.length()<1) {
                    //its new
                    list.add(summ);
                    if (max < summ) {
                        max = summ;
                    }
                    summ = 0;
                }
                try {
                    Integer curr = Integer.parseInt(currentLine);
                    summ += curr;
                } catch (Exception e){
                    //
                }
                //System.out.println(currentLine); // print the current line
            }
           // reader.close();
        Collections.sort(list);
        Collections.reverse(list);

            int amm = 0;
            for(int i =0; i < 3; i++) {
                amm+=list.get(i);
            }
        System.out.println(amm);
        return max;
    }

    public static void main(String[] args) throws IOException {
        FirstFoodCalories f = new FirstFoodCalories();
        //String path = "https://adventofcode.com/2022/day/1/input";
        f.getMax();
        //206643
        //212094 no  true
    }
}
