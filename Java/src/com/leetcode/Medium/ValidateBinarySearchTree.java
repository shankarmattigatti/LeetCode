package com.leetcode.Medium;

// 98. Validate Binary Search Tree
public class ValidateBinarySearchTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private static boolean isValidBST(TreeNode node, long min, long max) {
        if (node == null)
            return true;
        else if (node.val <= min || node.val >= max)
            return false;

        return isValidBST(node.left, min, node.val) && isValidBST(node.right, node.val, max);
    }
}
