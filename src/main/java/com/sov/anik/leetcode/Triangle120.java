package com.sov.anik.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Collections.min;

public class Triangle120 {

    public static int minimumm(List<List<Integer>> triangle) {
        int level = triangle.size();
        int result = 0;
        //for (int i = level;  i > 1; i--) {
        //    for(int j = 0; j < massOfResult; j++) {

        int[] resultation = new int[level+1];
        for(int i=level-1; i >= 0; i--){
            for(int j=0;j<triangle.get(i).size();j++){
                resultation[j] = Math.min(resultation[j],resultation[j+1])+triangle.get(i).get(j);
            }
        }
        return resultation[0];
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int result = 0;
        int level = triangle.size();
        if (level == 0) {
            return 0;
        }

        List<Integer> resultation = new ArrayList<>(triangle.get(level-1));
        int massOfResult = resultation.size();

        List<Integer> resultationIndex = IntStream.rangeClosed(0, massOfResult-1)
                .boxed().collect(Collectors.toList());

        System.out.println("" + "start");
        System.out.println(Arrays.toString(resultationIndex.toArray()));
        System.out.println(Arrays.toString(resultation.toArray()));

        for (int i = level;  i > 1; i--) {
            for(int j = 0; j < massOfResult; j++) {
                int middleresult = minAmount(j, triangle.get(i-1), resultationIndex);
                int value = resultation.get(j) + middleresult;
                resultation.set(j, value);
            }
            System.out.println("" + i);
            System.out.println(Arrays.toString(resultationIndex.toArray()));
            System.out.println(Arrays.toString(triangle.get(i-2).toArray()));
            System.out.println(Arrays.toString(resultation.toArray()));
        }
        return min(resultation);
    }

    public static int minAmount(int index, List<Integer> currentList, List<Integer> listIndex) {
        int previousIndex = listIndex.get(index);
        if (currentList.size() < previousIndex) {
            listIndex.set(index, currentList.size()-1);
            return currentList.get(currentList.size() - 1);
        }
        Integer left = Integer.MAX_VALUE;
        if (previousIndex > 0) {
          left = currentList.get(previousIndex - 1);
        }
        Integer right = Integer.MAX_VALUE;
        if (previousIndex  < currentList.size()) {
            right = currentList.get(previousIndex);
        }
        if (left < right) {
            listIndex.set(index, previousIndex-1);
            return left;
        }
        return right;
    }
}
