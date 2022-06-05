package com.leetcode.Medium;

import java.util.*;

// 107. Binary Tree Level Order Traversal II
public class BinaryTreeLevelOrderTraversalII {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null)
            return list;

        Queue<TreeNode> queue = new LinkedList<>();
        int currentLevelNum = 1, nextLevelNum = 0;
        queue.offer(root);
        List<Integer> levelOrder = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            currentLevelNum--;
            levelOrder.add(node.val);

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
                list.add(new ArrayList<>(levelOrder));
                levelOrder.clear();
            }
        }

        Collections.reverse(list);
        return list;
    }
}
