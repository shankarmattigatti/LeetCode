package com.leetcode.Medium;

// 450. Delete Node in a BST
public class DeleteNodeInABST {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null)
            return null;

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        } else if (root.val < key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left != null && root.right != null) {
                TreeNode minNodeFromRight = minElement(root.right);
                root.val = minNodeFromRight.val;
                root.right = deleteNode(root.right, minNodeFromRight.val);
            } else if (root.right != null) {
                root = root.right;
            } else if (root.left != null) {
                root = root.left;
            } else {
                root = null;
            }
        }
        return root;
    }

    private TreeNode minElement(TreeNode node) {
        if (node.left == null)
            return node;
        else
            return minElement(node.left);
    }
}
