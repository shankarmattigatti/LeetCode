package com.leetcode.Medium;

import java.util.*;

// 513. Find Bottom Left Tree Value
public class FindBottomLeftTreeValue {
    public static class TreeNode {
        int val;
        TreeNode left, right;
    }

    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.right != null)
                queue.offer(root.right);
            if (root.left != null)
                queue.offer(root.left);
        }

        return root.val;
    }
}
