package com.leetcode.Medium;

import java.util.*;

// 230. Kth Smallest Element in a BST
public class KthSmallestElementInABST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        if (root == null)
            return 0;

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode A = root;
        while (A != null || !stack.isEmpty()) {
            while (A != null) {
                stack.push(A);
                A = A.left;
            }

            A = stack.pop();
            list.add(A.val);

            A = A.right;
        }

        Collections.sort(list);
        return list.get(k - 1);
    }
}
