package com.leetcode.Medium;

import java.util.*;

// 114. Flatten Binary Tree to Linked List
public class FlattenBinaryTreeToLinkedList {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    public void flatten(TreeNode root) {
        if (root == null)
            return;

        List<Integer> ls = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            ls.add(node.val);

            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }

        root.left = null;
        TreeNode currNode = root;
        for (int i = 1; i < ls.size(); i++) {
            TreeNode node = new TreeNode(ls.get(i));
            currNode.right = node;
            currNode = node;
        }
    }
}
