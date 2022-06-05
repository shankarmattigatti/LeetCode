package com.leetcode.Easy;

import java.util.*;

// 144. Binary Tree Preorder Traversal
public class BinaryTreePreorderTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                res.add(root.val);
                if (root.right != null)
                    stack.push(root.right);

                root = root.left;
            }

            if (!stack.isEmpty()) {
                root = stack.pop();
            }
        }
        return res;
    }
}
