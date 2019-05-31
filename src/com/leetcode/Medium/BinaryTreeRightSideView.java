package com.leetcode.Medium;

import java.util.*;

// 199. Binary Tree Right Side View
public class BinaryTreeRightSideView {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightView(root, list, 0);
        return list;
    }

    private static void rightView(TreeNode node, List<Integer> list, int depth) {
        if (node == null)
            return;

        if (depth == list.size()) {
            list.add(node.val);
        }

        rightView(node.right, list, depth + 1);
        rightView(node.left, list, depth + 1);
    }
}
