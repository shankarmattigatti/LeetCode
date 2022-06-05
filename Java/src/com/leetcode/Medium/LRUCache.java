package com.leetcode.Medium;

import java.util.HashMap;

// 146. LRU Cache
public class LRUCache {
    static class Node {
        int key, value;
        Node prev, next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    Node head, tail;
    HashMap<Integer, Node> map;
    int cap;

    public LRUCache(int capacity) {
        this.cap = capacity;
        map = new HashMap<>();
    }

    private void removeNode(Node node) {
        if (node.prev != null)
            node.prev.next = node.next;
        else
            head = node.next;

        if (node.next != null)
            node.next.prev = node.prev;
        else
            tail = node.prev;
    }

    private void offerNode(Node node) {
        if (tail != null)
            tail.next = node;

        node.prev = tail;
        node.next = null;
        tail = node;

        if (head == null)
            head = tail;
    }

    public int get(int key) {
        if (map.get(key) == null)
            return -1;

        // move to tail
        Node node = map.get(key);
        removeNode(node);
        offerNode(node);

        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;

            // move to tail
            removeNode(node);
            offerNode(node);
        } else {
            if (map.size() >= cap) {
                // delete head
                map.remove(head.key);
                removeNode(head);
            }

            // add to tail
            Node node = new Node(key, value);
            offerNode(node);
            map.put(key, node);
        }
    }
}
