package com.leetcode.Medium;

import java.util.*;

// 1609. Even Odd Tree
public class EvenOddTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isEvenOddTree(TreeNode root) {
        if (root == null)
            return true;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isEven = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int prev = isEven ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (isEven && (node.val % 2 == 0 || node.val <= prev))
                    return false;
                if (!isEven && (node.val % 2 == 1 || node.val >= prev))
                    return false;

                prev = node.val;
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            isEven = !isEven;
        }
        return true;
    }
}
