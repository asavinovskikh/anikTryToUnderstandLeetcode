package com.sov.anik.stepik;
import java.util.Scanner;

public class ScannerSplitOdd {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String str;
            if(!sc.hasNextLine()){
                return;
            }
            str =sc.nextLine();
            String [] strs = str.split(" ");
            int size = strs.length;
            if (size == 0) {
                return;
            }

            StringBuilder sb = new StringBuilder();
            for(int i = size - 1; i >= 0; i --) {
                if (i % 2 != 0) {
                    sb.append(strs[i] + " ");
                }
            }
            String result = sb.toString();
            result.trim();
            System.out.print(result);
            return;
        }
    }



}
