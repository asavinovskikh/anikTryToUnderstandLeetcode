package com.sov.anik.timus;


//https://acm.timus.ru/problem.aspx?space=1&num=1293

import java.io.PrintWriter;
import java.util.Scanner;

public class Enia {

        public int eniaText(int num, int width, int length) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();

            PrintWriter out = new PrintWriter(System.out);
            out.println("" + eniaText(n, a, b));
            out.flush();

            return num*2*width*length;
        }

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();



    }

}

