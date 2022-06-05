package com.leetcode.Easy;

import java.util.*;

// 897. Increasing Order Search Tree
public class IncreasingOrderSearchTree {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) return null;

        List<Integer> list = new ArrayList<>();
        inOrder(root, list);
        Collections.sort(list);
        TreeNode temp = new TreeNode(list.get(0));
        TreeNode curr = temp;
        for (int i = 1; i < list.size(); i++) {
            curr.right = new TreeNode(list.get(i));
            curr = curr.right;
        }
        return temp;
    }

    private void inOrder(TreeNode root, List<Integer> list) {
        if (root == null)
            return;

        list.add(root.val);
        inOrder(root.left, list);
        inOrder(root.right, list);
    }
}
