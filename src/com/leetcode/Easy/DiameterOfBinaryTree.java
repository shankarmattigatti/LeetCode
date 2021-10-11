package com.leetcode.Easy;

// 543. Diameter of Binary Tree
public class DiameterOfBinaryTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class A {
        int ans = Integer.MIN_VALUE;
    }

    private int height(TreeNode root, A a) {
        if(root == null)
            return 0;

        int leftHeight = height(root.left, a);

        int rightHeight = height(root.right, a);

        a.ans = Math.max(a.ans, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null)
            return 0;

        A a = new A();
        int heightOfTree = height(root, a);
        return a.ans;
    }
}
