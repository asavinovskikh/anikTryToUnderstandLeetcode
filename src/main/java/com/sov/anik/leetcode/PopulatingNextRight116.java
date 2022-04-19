package com.sov.anik.leetcode;

public class PopulatingNextRight116 {

    public ThreeNode connect(ThreeNode root) {
        ThreeNode level_start = root;
        ThreeNode current = level_start;
        while (level_start != null) {
            current = level_start;
            while (current != null) {
                if (current.left != null) {
                    current.left.next = current.right;
                }
                if (current.right != null && current.next != null) {
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            level_start = level_start.left;
        }
        return level_start;
    }
}