package com.leetcode.Medium;

// 2130. Maximum Twin Sum of a Linked List
public class MaximumTwinSumOfALinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public int pairSum(ListNode head) {
        if (head == null)
            return 0;
        if (head.next == null)
            return head.val;

        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverse(slow);
        fast = head;
        int sum = Integer.MIN_VALUE;
        while (slow != null) {
            sum = Math.max(slow.val + fast.val, sum);
            slow = slow.next;
            fast = fast.next;
        }
        return sum;
    }

    private ListNode reverse(ListNode node) {
        ListNode previous = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = previous;
            previous = node;
            node = next;
        }
        return previous;
    }
}
