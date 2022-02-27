package com.leetcode.Easy;

import java.util.*;

// 589. N-ary Tree Preorder Traversal
public class NaryTreePreorderTraversal {
    static class Node {
        public int val;
        public List<Node> children;
    }

    public List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;

        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node node = stack.pop();
            res.add(node.val);
            List<Node> childrens = node.children;
            for(int i = childrens.size() - 1; i >= 0; i--) {
                stack.push(childrens.get(i));
            }
        }
        return res;
    }
}
