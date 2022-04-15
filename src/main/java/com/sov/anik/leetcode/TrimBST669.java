package com.sov.anik.leetcode;

//сократить дерево до состояния "между low и high"
public class TrimBST669 {
    public ThreeNode trimBST(ThreeNode root, int low, int high) {
        if (root == null) return null;
        if (root.val > high) return trimBST(root.left, low, high);
        if (root.val < low) return trimBST(root.right, low, high);

        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);

        return root;
    }
}
