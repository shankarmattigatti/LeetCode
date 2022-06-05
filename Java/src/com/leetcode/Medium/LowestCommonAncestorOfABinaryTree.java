package com.leetcode.Medium;

// 236. Lowest Common Ancestor of a Binary Tree
public class LowestCommonAncestorOfABinaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null)
            return null;

        if (root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null)
            return root;
        if (left == null && right == null)
            return null;

        return left != null ? left : right;
    }
}
