package com.leetcode.Easy;

// 83. Remove Duplicates from Sorted List
public class DeleteDuplicates {

    ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int value) {
            val = value;
            next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;

        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val)
                current.next = current.next.next;
            else
                current = current.next;
        }
        return head;
    }
}
