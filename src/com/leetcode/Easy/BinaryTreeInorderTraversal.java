package com.leetcode.Easy;

import java.util.*;

// 94. Binary Tree Inorder Traversal
public class BinaryTreeInorderTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    private List<Integer> result;

    public List<Integer> inorderTraversal(TreeNode root) {
        result = new ArrayList<>();
        inorder(root);
        return result;
    }

    private void inorder(TreeNode node) {
        if (node == null)
            return;

        inorder(node.left);
        result.add(node.val);
        inorder(node.right);
    }
}
