package com.leetcode.Easy;

// 	876. Middle of the Linked List
public class MiddleOfTheLinkedList {
    ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int value) {
            val = value;
            next = null;
        }
    }

    public ListNode middleNode(ListNode head) {
        if (head == null)
            return null;

        int mid = 0, size = 0;
        ListNode curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        curr = head;
        for (int i = 0; i < (size / 2); i++) {
            curr = curr.next;
        }
        head = curr;
        return head;
    }
}
