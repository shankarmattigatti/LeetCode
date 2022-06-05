package com.leetcode.Medium;

// 86. Partition List
public class PartitionList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode partition(ListNode head, int x) {
        if (head == null)
            return null;

        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        l1.next = head;

        ListNode curr = head;
        ListNode p1 = l1;
        ListNode p2 = l2;
        while (curr != null) {
            if (curr.val < x) {
                curr = curr.next;
                p1 = p1.next;
            } else {

                p2.next = curr;
                p1.next = curr.next;

                curr = p1.next;
                p2 = p2.next;
            }
        }

        p2.next = null;
        p1.next = l2.next;

        return l1.next;
    }
}
