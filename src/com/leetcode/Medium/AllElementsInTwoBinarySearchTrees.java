package com.leetcode.Medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

// 5296. All Elements in Two Binary Search Trees
public class AllElementsInTwoBinarySearchTrees {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null)
            return list;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);

            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }

        return list;
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list = new ArrayList<>();
        List<Integer> l1 = preorderTraversal(root1);
        List<Integer> l2 = preorderTraversal(root2);
        list.addAll(l1);
        list.addAll(l2);
        Collections.sort(list);
        return list;
    }
}
