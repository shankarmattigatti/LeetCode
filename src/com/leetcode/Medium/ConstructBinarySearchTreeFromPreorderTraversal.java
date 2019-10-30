package com.leetcode.Medium;

// 1008. Construct Binary Search Tree from Preorder Traversal
public class ConstructBinarySearchTreeFromPreorderTraversal {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int i = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        return bstFromPreorder(preorder, Integer.MAX_VALUE);
    }

    private TreeNode bstFromPreorder(int[] arr, int j) {
        if (i == arr.length || arr[i] > j)
            return null;

        TreeNode node = new TreeNode(arr[i++]);
        node.left = bstFromPreorder(arr, node.val);
        node.right = bstFromPreorder(arr, j);
        return node;
    }
}
