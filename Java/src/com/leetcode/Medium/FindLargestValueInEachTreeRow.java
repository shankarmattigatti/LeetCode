package com.leetcode.Medium;

import java.util.*;

// 515. Find Largest Value in Each Tree Row
public class FindLargestValueInEachTreeRow {
    public static class TreeNode {
        int val;
        TreeNode left, right;
    }

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int max = Integer.MIN_VALUE;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                max = Math.max(max, node.val);

                if (node.left != null)
                    queue.add(node.left);

                if (node.right != null)
                    queue.add(node.right);
            }
            res.add(max);
        }
        return res;
    }
}
