package com.leetcode.Easy;

// 108. Convert Sorted Array to Binary Search Tree
public class ConvertSortedArrayToBinarySearchTree {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0)
            return null;

        return bst(nums, 0, nums.length - 1);
    }

    private static TreeNode bst(int[] nums, int low, int high) {
        if (low > high)
            return null;

        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = bst(nums, low, mid - 1);
        node.right = bst(nums, mid + 1, high);
        return node;
    }
}
