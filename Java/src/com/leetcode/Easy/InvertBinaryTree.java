package com.leetcode.Easy;

// 226. Invert Binary Tree
public class InvertBinaryTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        root.left = invertTree(root.right);
        root.right = invertTree(root.left);

        return root;
    }
}
