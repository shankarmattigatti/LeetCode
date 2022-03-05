package com.leetcode.Easy;

import java.util.*;

// 501. Find Mode in Binary Search Tree
public class FindModeInBinarySearchTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
    }

    private int max = 0;
    private Map<Integer, Integer> map;

    public int[] findMode(TreeNode root) {
        if (root == null)
            return new int[0];

        map = new HashMap<>();
        inorder(root);

        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max)
                res.add(entry.getKey());
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

    private void inorder(TreeNode node) {
        if (node.left != null)
            inorder(node.left);

        int val = node.val;
        map.put(val, map.getOrDefault(val, 0) + 1);
        max = Math.max(max, map.get(val));

        if (node.right != null)
            inorder(node.right);
    }
}
