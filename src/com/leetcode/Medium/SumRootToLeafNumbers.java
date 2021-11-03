package com.leetcode.Medium;

// 129. Sum Root to Leaf Numbers
public class SumRootToLeafNumbers {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int sumNumbers(TreeNode root) {
        return dfs(root, 0, 0);
    }

    private int dfs(TreeNode node, int num, int sum) {
        if (node == null)
            return sum;

        num = num * 10 + node.val;

        if (node.left == null && node.right == null)
            return sum + num;

        return dfs(node.left, num, sum) + dfs(node.right, num, sum);
    }
}
