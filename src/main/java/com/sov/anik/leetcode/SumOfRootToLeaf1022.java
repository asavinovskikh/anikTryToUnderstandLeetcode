package com.sov.anik.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfRootToLeaf1022 {

    public int sumRootToLeaf(TreeNode root) {
        Queue<Integer> qu = new LinkedList<Integer>();
        int result = 0;
        acceptSummLeafs(root, qu, 0);
        return result;
    }

    public int acceptSummLeafs(TreeNode root, Queue<Integer> qu, int size) {
        int currentResult = 0;
        if (root == null) {
            int [] currArray = new int[size];
            int index = 0;
            while (!qu.isEmpty()) {
                currArray[index] = qu.peek();
            }
            currentResult = getIntFromArrayInvert(currArray);
        }
        return currentResult;
    }

    //001 = это четыре! (обратная запись)
    public static int getIntFromArrayInvert(int [] ar) {
        int len = ar.length;
        int result = 0;
        int k = 1;
        for(int i = 0; i < len; i--) {
            result += ar[i]*k;
            k *=2;
        }
        return result;
    }
    //100 - это четыре (прямая запись)
    public static int getIntFromArray(int [] ar) {
        int len = ar.length;
        int result = 0;
        int k = 1;
        for(int i = len-1; i >=0; i--) {
            result += ar[i]*k;
            k *=2;
        }
        return result;
    }
}
