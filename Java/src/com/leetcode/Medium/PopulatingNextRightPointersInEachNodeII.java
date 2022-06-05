package com.leetcode.Medium;

import java.util.*;

// 117. Populating Next Right Pointers in Each Node II
public class PopulatingNextRightPointersInEachNodeII {
    static class Node {
        public int val;
        public Node left, right, next;
    }

    public Node connect(Node root) {
        if (root == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Node> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                list.add(node);

                if (node.left != null)
                    queue.offer(node.left);

                if (node.right != null)
                    queue.offer(node.right);
            }

            for (int i = 0; i < list.size() - 1; i++) {
                list.get(i).next = list.get(i + 1);
            }
        }

        return root;
    }
}
