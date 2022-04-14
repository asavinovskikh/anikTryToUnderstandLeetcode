package com.sov.anik.leetcode;

public class ThreeNode {
        public int val;
        public ThreeNode left;
        public ThreeNode right;
        public ThreeNode next;

        public ThreeNode() {}

        public ThreeNode(int _val) {
            val = _val;
        }

        public ThreeNode(int _val, ThreeNode _left, ThreeNode _right, ThreeNode _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };
