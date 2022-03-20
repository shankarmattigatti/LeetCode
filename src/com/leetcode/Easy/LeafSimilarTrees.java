package com.leetcode.Easy;

import java.util.*;

// 872. Leaf-Similar Trees
public class LeafSimilarTrees {
    static class TreeNode {
        int val;
        TreeNode left, right;
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = getAllLeafNodes(root1);
        List<Integer> list2 = getAllLeafNodes(root2);

        if(list1.size() != list2.size())
            return false;

        for(int i = 0; i < list1.size(); i++) {
            if(!Objects.equals(list1.get(i), list2.get(i)))
                return false;
        }
        return true;
    }

    private List<Integer> getAllLeafNodes(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if(node.left == null && node.right == null)
                res.add(node.val);

            if(node.left != null)
                stack.push(node.left);
            if(node.right != null)
                stack.push(node.right);
        }
        return res;
    }
}
