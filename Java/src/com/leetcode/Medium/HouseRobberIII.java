package com.leetcode.Medium;

// 337. House Robber III
public class HouseRobberIII {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public int rob(TreeNode root) {
        int[] res = dfs(root);
        return Math.max(res[0], res[1]);
    }

    private int[] dfs(TreeNode node) {
        if (node == null)
            return new int[2];

        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        int[] res = new int[2];
        res[0] = left[1] + right[1] + node.val;
        res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

        return res;
    }
}
