package com.leetcode.Easy;

import java.util.*;

// 559. Maximum Depth of N-ary Tree
public class MaximumDepthOfNaryTree {
    static class Node {
        public int val;
        public List<Node> children;

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public int maxDepth(Node root) {
        if (root == null) return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                List<Node> childrens = node.children;

                for (Node children : childrens)
                    queue.add(children);
            }
            level++;
        }
        return level;
    }
}
