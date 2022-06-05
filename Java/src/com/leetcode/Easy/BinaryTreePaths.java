package com.leetcode.Easy;

import java.util.*;

// 257. Binary Tree Paths
public class BinaryTreePaths {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new LinkedList<>();

        if (root == null)
            return paths;

        if (root.left == null && root.right == null) {
            paths.add(Integer.toString(root.val));
            return paths;
        }

        for (String path : binaryTreePaths(root.left)) {
            paths.add(root.val + "->" + path);
        }

        for (String path : binaryTreePaths(root.right)) {
            paths.add(root.val + "->" + path);
        }

        return paths;
    }
}
