package com.leetcode.Easy;

// 563. Binary Tree Tilt
public class BinaryTreeTilt {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int result = 0;

    public int findTilt(TreeNode root) {
        postOrder(root);
        return result;
    }

    private int postOrder(TreeNode node) {
        if (node == null)
            return 0;

        int left = postOrder(node.left);
        int right = postOrder(node.right);

        result += Math.abs(left - right);

        return left + right + node.val;
    }
}
