package com.leetcode.Easy;

import java.util.Stack;

// 671. Second Minimum Node In a Binary Tree
public class SecondMinimumNodeInABinaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null)
            return -1;

        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<>();
        long min = Long.MAX_VALUE, secondMin = Long.MAX_VALUE;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            if (curr.val < min) {
                secondMin = min;
                min = curr.val;
            } else if (curr.val < secondMin && curr.val != min) {
                secondMin = curr.val;
            }
            curr = curr.right;
        }

        return secondMin == Long.MAX_VALUE ? -1 : (int) secondMin;
    }
}
