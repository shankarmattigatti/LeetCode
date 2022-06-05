package com.leetcode.Medium;

// 92. Reverse Linked List II
public class ReverseLinkedListII {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null || m >= n) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;
        int pos = 0;
        while (curr != null && pos < m - 1) {
            prev = curr;
            curr = curr.next;
            pos++;
        }
        while (curr.next != null && m < n) {
            ListNode next = curr.next;
            curr.next = next.next;
            next.next = prev.next;
            prev.next = next;
            m++;
        }
        return dummy.next;
    }
}
