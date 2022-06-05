package com.leetcode.Easy;

import java.util.Stack;

// 530. Minimum Absolute Difference in BST
public class MinimumAbsoluteDifferenceInBST {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int getMinimumDifference(TreeNode root) {
        if (root == null)
            return 0;

        int min = Integer.MAX_VALUE;
        TreeNode cur = root, pre = null;
        Stack<TreeNode> stack = new Stack<>();
        while (cur != null || !stack.empty()) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                cur = stack.pop();
                if (pre != null)
                    min = Math.min(min, cur.val - pre.val);
                pre = cur;
                cur = cur.right;
            }
        }
        return min;
    }
}
