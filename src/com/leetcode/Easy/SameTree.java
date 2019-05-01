package com.leetcode.Easy;

// 100. Same Tree
public class SameTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSameTree(TreeNode a, TreeNode b) {
        if (a == null && b == null)
            return true;

        if (a != null && b != null)
            return (a.val == b.val
                    && isSameTree(a.left, b.left)
                    && isSameTree(a.right, b.right));

        return false;
    }
}
