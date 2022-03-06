package com.leetcode.Easy;

// 101. Symmetric Tree
public class SymmetricTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null)
            return true;

        if (n1 != null && n2 != null && n1.val == n2.val)
            return isMirror(n1.left, n2.right) && isMirror(n1.right, n2.left);

        return false;
    }
}
