package com.leetcode.Easy;


// 707. Design Linked List
public class DesignLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;

    public DesignLinkedList() {
    }

    public int get(int index) {
        if (index >= size || index < 0) return -1;
        Node temp = head;
        int count = 0;
        while (temp != null && count < index) {
            count++;
            temp = temp.next;
        }
        return temp.data;
    }

    public void addAtHead(int val) {
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
        size++;
    }

    public void addAtTail(int val) {
        Node new_node = new Node(val);
        if (head == null) {
            head = new Node(val);
            return;
        }
        size++;
        new_node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        return;
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index == 0) {
            addAtHead(val);
        } else {
            size++;
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Node node = new Node(val);
            node.next = current.next;
            current.next = node;
        }
    }

    public void deleteAtIndex(int index) {
        if (index >= size) return;
        size--;
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }
}
