package com.leetcode.Easy;

// 21. Merge Two Sorted Lists
public class MergeTwoSortedLists {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int value) {
            val = value;
            next = null;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(0);
        ListNode node = newHead;
        if (l1 == null) return l2;
        else if (l2 == null) return l1;
        else {
            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    node.next = l1;
                    l1 = l1.next;
                } else {
                    node.next = l2;
                    l2 = l2.next;
                }
                node = node.next;
            }
            while (l1 != null) {
                node.next = l1;
                l1 = l1.next;
                node = node.next;
            }
            while (l2 != null) {
                node.next = l2;
                l2 = l2.next;
                node = node.next;
            }


            return newHead.next;
        }
    }
}
