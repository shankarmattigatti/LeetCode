package com.leetcode.Easy;

// 111. Minimum Depth of Binary Tree
public class MinimumDepthOfBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);
        if(leftDepth == 0) {
            return 1 + rightDepth;
        } else if(rightDepth == 0) {
            return 1 + leftDepth;
        }

        return 1 + Math.min(leftDepth, rightDepth);
    }
}
