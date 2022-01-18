package com.sov.anik.leetcode;

//https://leetcode.com/problems/search-a-2d-matrix/

public class SearchIn2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int length_horizontal = matrix.length - 1;
        int index_horizontal = 0;
        while (index_horizontal < length_horizontal) {
            int length_vertical = matrix[index_horizontal].length - 1;
            if (matrix[index_horizontal][0] > target) {
                break;
            }
            if (matrix[index_horizontal][length_vertical] < target) {
                continue;
            }
            if (matrix[index_horizontal][0] < target &&
                    matrix[index_horizontal][length_vertical] > target){
                int index_vertical = 0;
                while (index_vertical < length_vertical) {
                    if (matrix[index_horizontal][length_vertical] == target) {
                        return true;
                    }
                    index_vertical ++;
                }
            }
            index_horizontal++;
        }
        return false;
    }


    public static void main(String[] args) {
        int [][] nums = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 0;
        SearchIn2DMatrix search = new SearchIn2DMatrix();
        boolean result = search.searchMatrix(nums, target);
        System.out.printf("result {}", result);

    }
}
