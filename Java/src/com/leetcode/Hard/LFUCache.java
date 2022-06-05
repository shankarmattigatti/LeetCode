package com.leetcode.Hard;

import java.util.*;

// 460. LFU Cache
public class LFUCache {
    static class Node {
        Node prev, next;
        int key, val, count;

        Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.count = 1;
        }
    }

    static class DoubleLinkedList {
        int size;
        Node head, tail;

        DoubleLinkedList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);
            head.next = tail;
            tail.prev = head;
        }

        void add(Node node) {
            head.next.prev = node;
            node.next = head.next;
            node.prev = head;
            head.next = node;
            size++;
        }

        void remove(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
            size--;
        }

        Node removeLast() {
            if (size > 0) {
                Node node = tail.prev;
                remove(node);
                return node;
            }
            return null;
        }
    }

    private int min;
    private int size;
    private final int capacity;
    private final Map<Integer, Node> nodeMap;
    private final Map<Integer, DoubleLinkedList> countMap;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        nodeMap = new HashMap<>();
        countMap = new HashMap<>();
    }

    public int get(int key) {
        if (!nodeMap.containsKey(key))
            return -1;

        Node node = nodeMap.get(key);
        update(node);
        return node.val;
    }

    public void put(int key, int val) {
        if (capacity == 0)
            return;

        if (nodeMap.containsKey(key)) {
            Node node = nodeMap.get(key);
            node.val = val;
            update(node);
        } else {
            Node node = new Node(key, val);
            nodeMap.put(key, node);
            if (size == capacity) {
                DoubleLinkedList lastList = countMap.get(min);
                nodeMap.remove(lastList.removeLast().key);
                size--;
            }

            size++;
            min = 1;
            DoubleLinkedList newList = countMap.getOrDefault(node.count, new DoubleLinkedList());
            newList.add(node);
            countMap.put(node.count, newList);
        }
    }

    private void update(Node node) {
        DoubleLinkedList oldList = countMap.get(node.count);
        oldList.remove(node);
        if (node.count == min && oldList.size == 0)
            min++;

        node.count++;
        DoubleLinkedList newList = countMap.getOrDefault(node.count, new DoubleLinkedList());
        newList.add(node);
        countMap.put(node.count, newList);
    }
}
