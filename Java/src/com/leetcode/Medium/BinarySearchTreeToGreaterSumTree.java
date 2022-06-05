package com.leetcode.Medium;

import java.util.*;

// 1038. Binary Search Tree to Greater Sum Tree
public class BinarySearchTreeToGreaterSumTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode bstToGst(TreeNode root) {
        if (root == null)
            return null;

        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        int s = 0;
        while (node != null || !stack.isEmpty()) {

            while (node != null) {
                stack.push(node);
                node = node.right;
            }

            node = stack.pop();
            s += node.val;
            node.val = s;

            node = node.left;
        }
        return root;
    }
}
