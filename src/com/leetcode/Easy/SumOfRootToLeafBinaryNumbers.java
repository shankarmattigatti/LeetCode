package com.leetcode.Easy;

// 1022. Sum of Root To Leaf Binary Numbers
public class SumOfRootToLeafBinaryNumbers {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    static int dfs(TreeNode root, int val) {
        if (root == null)
            return 0;

        val = val * 2 + root.val;

        return root.left == root.right ? val : dfs(root.left, val) + dfs(root.right, val);
    }
}
