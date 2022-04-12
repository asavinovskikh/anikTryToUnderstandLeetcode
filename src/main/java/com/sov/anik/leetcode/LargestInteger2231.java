package com.sov.anik.leetcode;

public class LargestInteger2231 {
    public static int largestInteger(int num) {
        String temp = Integer.toString(num);
        int[] newGuess = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++)
        {
            newGuess[i] = temp.charAt(i) - '0';
        }

        if (temp.length() < 3) {
            return num;
        }

        for(int i = 0; i < temp.length(); i++) {
            for (int j = i + 1; j < temp.length(); j++) {
                if (newGuess[i]%2-newGuess[j]%2 == 0) {
                    if (newGuess[i] < newGuess[j]) {
                        int c = newGuess[i];
                        newGuess[i] =  newGuess[j];
                        newGuess[j] = c;
                    }
                }
            }
        }



         int result = 0;
            for (int i = 0; i < newGuess.length; i++) {
                result=result*10+newGuess[i];
            }

            return result;
    }


    public static int anotherLargestInteger(int n){
        char[] a = String.valueOf(n).toCharArray();
        for(int i = 0; i < a.length; i++)
            for(int j = i + 1; j < a.length; j++)
                if(a[j] > a[i] && (a[j] - a[i]) % 2 == 0){
                    char t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
        return Integer.parseInt(new String(a));
    }

    //public static void main(String[] args)
    //{
    //    int num = 1234567;
    //    int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();
    //    for(int d : digits)
    //        System.out.print(d);
    //}

}
