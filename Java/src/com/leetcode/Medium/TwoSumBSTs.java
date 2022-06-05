package com.leetcode.Medium;

import java.util.Stack;

// 1214. Two Sum BSTs
public class TwoSumBSTs {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {
        if (root1 == null || root2 == null)
            return false;

        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode top1, top2;

        while (true) {
            while (root1 != null) {
                stack1.push(root1);
                root1 = root1.left;
            }

            while (root2 != null) {
                stack2.push(root2);
                root2 = root2.right;
            }

            if (stack1.empty() || stack2.empty())
                break;

            top1 = stack1.peek();
            top2 = stack2.peek();

            if ((top1.val + top2.val) == target) {
                return true;
            } else if ((top1.val + top2.val) < target) {
                stack1.pop();
                root1 = top1.right;
            } else {
                stack2.pop();
                root2 = top2.left;
            }
        }
        return false;
    }
}
