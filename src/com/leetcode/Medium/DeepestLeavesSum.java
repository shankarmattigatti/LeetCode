package com.leetcode.Medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 1302. Deepest Leaves Sum
public class DeepestLeavesSum {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int deepestLeavesSum(TreeNode root) {
        if (root == null)
            return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        int currLevel = 1, nextLevel = 0, sum = 0;
        List<Integer> list = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            currLevel--;
            list.add(node.val);

            if (node.left != null) {
                queue.offer(node.left);
                nextLevel++;
            }

            if (node.right != null) {
                queue.offer(node.right);
                nextLevel++;
            }

            if (currLevel == 0) {
                currLevel = nextLevel;
                nextLevel = 0;
                sum = list.stream().mapToInt(Integer::intValue).sum();
                list.clear();
            }
        }

        return sum;
    }
}
