package com.sov.anik.euler;

public class Euler4 {
    public static void getSmth(){
        int max = 0;
        int maxx = 0;
        int maxy = 0;

        for(int i = 999; i > 99; i--) {
            for(int j = 999; j > 99; j--) {
                int k = i*j;
                if (isPal(k)) {
                    if (k > max) {
                        System.out.println(i + " " + j + " res" + i*j);
                        max = k;
                        maxx = i;
                        maxy = j;
                    }
                }
            }
        }

        System.out.println(max + " " + maxx + "  " + maxy);
        return;

    }

    public static boolean isPal(int a) {
        int[] list = getArray(a);
        int length = list.length;
        for(int i = 0; i < length/2; i++) {
            if (list[i] != list [length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int [] getArray(int a) {
        int[] l = new int[10];
        int ind = 0;
        while(a > 0) {
            int k = a % 10;
            l[ind] = k;
            ind++;
            a = a / 10;
        }

        int[] result = new int[ind];
        int j = 0;
        for(int i = ind-1; i >= 0; i --) {
            result[j] = l[i];
            j++;
        }
        return result;
    }



    public static void main(String[] args) {
        getSmth();
    }

}
