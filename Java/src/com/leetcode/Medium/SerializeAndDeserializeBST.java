package com.leetcode.Medium;

import java.util.*;

public class SerializeAndDeserializeBST {
    public static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }

    private void serialize(TreeNode node, StringBuilder sb) {
        if (node == null) return;
        sb.append(node.val).append(",");
        serialize(node.left, sb);
        serialize(node.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.isEmpty()) return null;

        Queue<String> queue = new LinkedList<>(Arrays.asList(data.split(",")));
        return deserialize(queue, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode deserialize(Queue<String> queue, int min, int max) {
        if (queue.isEmpty()) return null;

        int val = Integer.parseInt(queue.peek());
        if (val < min || val > max) return null;

        queue.poll();
        TreeNode node = new TreeNode(val);
        node.left = deserialize(queue, min, val);
        node.right = deserialize(queue, val, max);
        return node;
    }
}
