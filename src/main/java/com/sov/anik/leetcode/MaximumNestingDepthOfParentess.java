package com.sov.anik.leetcode;

//https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
public class MaximumNestingDepthOfParentess {

    public int maxDepth(String s) {
        char[] result = s.toCharArray();
        int depth = 0;
        int maxDepth = 0;
        for(int i = 0; i < result.length; i++) {
            if (result[i] == '(') {
                depth++;
            }
            if (result[i] == ')') {
                depth--;
            }
            if (depth > maxDepth) {
                maxDepth = depth;
            }

        }
        if (depth == 0 ) {
            return maxDepth;
        }
        return 0;

    }

    public static void main(String[] args) {
        MaximumNestingDepthOfParentess rrr = new MaximumNestingDepthOfParentess();
        int [] nums = new int []{0,1,2,3,4};
        int [] index = new int [] {0,1,2,2,1};
        int  result =
                rrr.maxDepth("(1+(2*3)+((8)/4))+1");
            System.out.println(result);


    }


}
