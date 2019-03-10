package com.leetcode.Easy;

// 160. Intersection of Two Linked Lists
public class IntersectionOfTwoLinkedLists {
    ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int value) {
            val = value;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;

        ListNode slow = headA;
        ListNode fast = headB;
        while (slow != fast) {
            slow = slow == null ? headB : slow.next;
            fast = fast == null ? headA : fast.next;
        }

        return slow;

    }
}
