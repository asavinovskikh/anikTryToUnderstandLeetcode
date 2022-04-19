package com.sov.anik.leetcode;

public class ConvertBSTtoGreaterTree538 {
    int sum = 0;
    public ThreeNode convertBST(ThreeNode root) {
        //если корень пуст - возвращаем null
        if (root == null) return null;

        //сначала обработать правую ветвь
        convertBST(root.right);

        //потом корень
        int tmp = root.val;
        root.val += sum;
        sum += tmp;

        //потом левую
        convertBST(root.left);

        return root;
    }
}
