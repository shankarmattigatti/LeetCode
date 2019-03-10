package com.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// 94. Binary Tree Inorder Traversal
public class BinaryTreeInorderTraversal {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null)
            return list;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || stack.size() > 0) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            list.add(curr.val);
            curr = curr.right;
        }
        return list;
    }
}
