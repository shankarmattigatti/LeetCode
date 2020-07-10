package com.leetcode.Medium;

// 430. Flatten a Multilevel Doubly Linked List
public class FlattenAMultilevelDoublyLinkedList {
    public static class Node {
        int val;
        public Node next, prev, child;

        public Node(int x) {
            val = x;
        }
    }

    public static Node flatten(Node head) {
        if (head == null)
            return null;

        Node node = head, tail = head;
        while (tail.next != null)
            tail = tail.next;

        while (node != null) {
            if (node.child != null) {
                Node temp = node.child;
                while (temp.next != null)
                    temp = temp.next;

                temp.next = node.next;
                if (node.next != null)
                    node.next.prev = temp;

                node.next = node.child;
                node.child.prev = node;
                node.child = null;
            } else {
                node = node.next;
            }
        }
        return head;
    }
}
