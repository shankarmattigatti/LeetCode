package com.leetcode.Easy;

// 993. Cousins in Binary Tree
public class CousinsInBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;
    }

    static class Node {
        int parent, depth;
    }

    private final Node nodeX = new Node();
    private final Node nodeY = new Node();
    private int x, y;

    private void preOrder(TreeNode node, int parent, int depth) {
        if (node == null)
            return;

        if (node.val == x) {
            nodeX.parent = parent;
            nodeX.depth = depth;
        }

        if (node.val == y) {
            nodeY.parent = parent;
            nodeY.depth = depth;
        }

        preOrder(node.left, node.val, depth + 1);
        preOrder(node.right, node.val, depth + 1);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        this.x = x;
        this.y = y;
        preOrder(root, 0, 1);

        return nodeX.parent != nodeY.parent && nodeX.depth == nodeY.depth;
    }
}
