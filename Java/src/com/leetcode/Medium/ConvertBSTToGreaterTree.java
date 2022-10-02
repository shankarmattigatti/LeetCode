package com.leetcode.Medium;

import java.util.Stack;

// 538. Convert BST to Greater Tree
public class ConvertBSTToGreaterTree {
    public static class TreeNode {
        int val;
        TreeNode left, right;
    }

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return null;

        int sum = 0;
        TreeNode node = root;
        Stack<TreeNode> stack = new Stack<>();
        while (node != null || !stack.isEmpty()) {

            while (node != null) {
                stack.push(node);
                node = node.right;
            }

            node = stack.pop();
            sum += node.val;
            node.val = sum;

            node = node.left;
        }
        return root;
    }
}
