package com.leetcode.Easy;

// 700. Search in a Binary Search Tree
public class SearchInABinarySearchTree {
    static class TreeNode {
        int val;
        TreeNode left, right;
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;

        if (root.val == val)
            return root;

        if (val < root.val)
            return searchBST(root.left, val);
        else
            return searchBST(root.right, val);
    }
}
