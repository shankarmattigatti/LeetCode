package com.leetcode.Hard;

import java.util.*;

// 145. Binary Tree Postorder Traversal
public class BinaryTreePostorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode prev = null;
        while (!stack.isEmpty()) {

            TreeNode curr = stack.pop();

            if (prev == null || prev.left == curr || prev.right == curr) {
                if (curr.left != null)
                    stack.push(curr.left);
                else if (curr.right != null)
                    stack.push(curr.right);
                else {
                    stack.pop();
                    list.add(curr.val);
                }
            } else if (curr.left == prev) {
                if (curr.right != null)
                    stack.push(curr.right);
                else {
                    stack.pop();
                    list.add(curr.val);
                }
            } else if (curr.right != prev) {
                stack.pop();
                list.add(curr.val);
            }
            prev = curr;
        }
        return list;
    }
}
