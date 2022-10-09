package com.leetcode.Medium;

// 623. Add One Row to Tree
public class AddOneRowToTree {
    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 0 || d == 1) {
            TreeNode node = new TreeNode(v);
            node.left = d == 1 ? root : null;
            node.right = d == 0 ? root : null;
            return node;
        }

        if (root != null && d >= 2) {
            root.left = addOneRow(root.left, v, d > 2 ? d - 1 : 1);
            root.right = addOneRow(root.right, v, d > 2 ? d - 1 : 0);
        }
        return root;
    }
}
