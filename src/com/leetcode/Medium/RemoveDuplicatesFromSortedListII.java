package com.leetcode.Medium;

// 	82. Remove Duplicates from Sorted List II
public class RemoveDuplicatesFromSortedListII {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode slow = dummy.next;
        ListNode fast = slow.next;
        while (slow != null && fast != null) {
            if (slow.val == fast.val) {
                while (fast != null && slow.val == fast.val) {
                    fast = fast.next;
                }
                prev.next = fast;
                slow = prev.next;
                fast = slow == null ? null : slow.next;
            } else {
                prev = slow;
                slow = slow.next;
                fast = fast.next;
            }
        }
        return dummy.next;
    }
}
