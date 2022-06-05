package com.leetcode.Easy;

import java.util.*;

// 590. N-ary Tree Postorder Traversal
public class NaryTreePostorderTraversal {
    static class Node {
        public int val;
        public List<Node> children;
    }

    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            res.add(node.val);
            for (Node child : node.children)
                stack.push(child);
        }

        Collections.reverse(res);
        return res;
    }
}
