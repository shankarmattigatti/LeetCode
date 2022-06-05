package com.leetcode.Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 637. Average of Levels in Binary Tree
public class AverageOfLevelsInBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        if (root == null)
            return list;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int currentLevelNum = 1, nextLevelNum = 0;
        queue.offer(root);
        List<Double> ls = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            currentLevelNum--;
            ls.add((double) node.val);

            if (node.left != null) {
                queue.offer(node.left);
                nextLevelNum++;
            }

            if (node.right != null) {
                queue.offer(node.right);
                nextLevelNum++;
            }

            if (currentLevelNum == 0) {
                currentLevelNum = nextLevelNum;
                nextLevelNum = 0;
                double sum = ls.stream().mapToDouble(Double::doubleValue).sum();
                list.add(sum / ls.size());
                ls.clear();
            }
        }

        return list;
    }
}
