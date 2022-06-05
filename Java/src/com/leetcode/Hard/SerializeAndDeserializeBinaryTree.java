package com.leetcode.Hard;

import java.util.*;

// 297. Serialize and Deserialize Binary Tree
public class SerializeAndDeserializeBinaryTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return "[]";

        StringBuilder result = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                result.append("null,");
                continue;
            }

            result.append(node.val).append(",");
            queue.offer(node.left);
            queue.offer(node.right);
        }

        return "[" + result.substring(0, result.length() - 1) + "]";
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String input) {
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0)
            return null;

        int index = 0;
        String[] nodes = input.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(nodes[index++]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            if (index == nodes.length)
                break;

            TreeNode node = queue.poll();
            String item = nodes[index++];
            if (!item.equals("null")) {
                node.left = new TreeNode(Integer.parseInt(item));
                queue.offer(node.left);
            }
            if (index == nodes.length)
                break;

            item = nodes[index++];
            if (!item.equals("null")) {
                node.right = new TreeNode(Integer.parseInt(item));
                queue.offer(node.right);
            }
        }

        return root;
    }
}
