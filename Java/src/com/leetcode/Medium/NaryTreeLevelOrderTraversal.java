package com.leetcode.Medium;

import java.util.*;

// 429. N-ary Tree Level Order Traversal
public class NaryTreeLevelOrderTraversal {
    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                list.add(node.val);

                for (int j = 0; j < node.children.size(); j++) {
                    queue.offer(node.children.get(j));
                }
            }

            result.add(list);
        }

        return result;
    }
}
