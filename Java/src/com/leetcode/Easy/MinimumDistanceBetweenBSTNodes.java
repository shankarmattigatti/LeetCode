package com.leetcode.Easy;

import java.util.*;

// 783. Minimum Distance Between BST Nodes
public class MinimumDistanceBetweenBSTNodes {
    static class TreeNode {
        int val;
        TreeNode left, right;
    }

    public int minDiffInBST(TreeNode root) {
        if (root == null) return 0;

        int min = Integer.MAX_VALUE;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root, prev = null;
        while (curr != null || !stack.isEmpty()) {
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                curr = stack.pop();
                if (prev != null)
                    min = Math.min(min, curr.val - prev.val);
                prev = curr;
                curr = curr.right;
            }
        }
        return min;
    }
}
