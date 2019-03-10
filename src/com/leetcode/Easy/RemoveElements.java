package com.leetcode.Easy;

// 203. Remove Linked List Elements
public class RemoveElements {

    ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int value) {
            val = value;
            next = null;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;

        ListNode current = head;
        ListNode prev = fakeHead;
        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
            } else {
                prev = prev.next;
            }
            current = current.next;
        }
        return fakeHead.next;
    }
}
