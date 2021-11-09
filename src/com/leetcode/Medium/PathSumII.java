package com.leetcode.Medium;

import java.util.*;

// 113. Path Sum II
public class PathSumII {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    private final List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null)
            return result;

        findPath(root, targetSum, new ArrayList<>());
        return result;
    }

    private void findPath(TreeNode node, int target, List<Integer> list) {
        if (node == null)
            return;

        list.add(node.val);
        if (node.val == target && node.left == null && node.right == null) {
            result.add(new ArrayList<>(list));
        } else {
            findPath(node.left, target - node.val, list);
            findPath(node.right, target - node.val, list);
        }

        list.remove(list.size() - 1);
    }
}
