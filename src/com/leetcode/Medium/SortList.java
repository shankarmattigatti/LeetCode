package com.leetcode.Medium;

// 148. Sort List
public class SortList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

        ListNode n1 = sortList(head);
        ListNode n2 = sortList(slow);

        return mergeList(n1, n2);
    }

    private ListNode mergeList(ListNode n1, ListNode n2) {
        ListNode n = new ListNode(0), p = n;
        while (n1 != null && n2 != null) {
            if (n1.val < n2.val) {
                p.next = n1;
                n1 = n1.next;
            } else {
                p.next = n2;
                n2 = n2.next;
            }
            p = p.next;
        }
        if (n1 != null)
            p.next = n1;

        if (n2 != null)
            p.next = n2;

        return n.next;
    }
}
