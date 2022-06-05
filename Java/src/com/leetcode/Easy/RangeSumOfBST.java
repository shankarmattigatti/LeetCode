package com.leetcode.Easy;

// 938. Range Sum of BST
public class RangeSumOfBST {
    static class TreeNode {
        int val;
        TreeNode left, right;
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null)
            return 0;
        if (root.val < L)
            return rangeSumBST(root.right, L, R);
        if (root.val > R)
            return rangeSumBST(root.left, L, R);

        return root.val + rangeSumBST(root.right, L, R) + rangeSumBST(root.left, L, R);
    }
}
