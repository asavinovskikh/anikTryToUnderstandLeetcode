package com.sov.anik.leetcode;

import java.util.ArrayList;
import java.util.List;

//kidsWithCandies
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
public class KidsWithCandies {

    public int getMax(int[] candies){
        int max = 0;
        int i = 0;
        int length = candies.length;
        while(i < length) {
            if (candies[i] > max) {
                max = candies[i];
            }
            i++;
        }
        return max;
    }


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = getMax(candies);
        List<Boolean> result = new ArrayList<>();

        int length = candies.length;
        int i = 0;

        while(i < length) {
            if (candies[i] + extraCandies > max) {
                result.add(true);
            } else {
                result.add(false);
            }
            i++;
        }

        return result;
    }



    public static void main(String[] args) {

    }
}
