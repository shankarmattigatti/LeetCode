package com.leetcode.Medium;

import java.util.*;

// 109. Convert Sorted List to Binary Search Tree
public class ConvertSortedListToBinarySearchTree {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        return bst(list, 0, list.size() - 1);
    }

    private TreeNode bst(List<Integer> list, int low, int high) {
        if (low > high)
            return null;

        int mid = (low + high) / 2;
        TreeNode root = new TreeNode(list.get(mid));
        root.left = bst(list, low, mid - 1);
        root.right = bst(list, mid + 1, high);

        return root;
    }
}
