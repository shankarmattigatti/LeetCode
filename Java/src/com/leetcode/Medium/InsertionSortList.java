package com.leetcode.Medium;

// 147. Insertion Sort List
public class InsertionSortList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null) return head;

        ListNode temp = new ListNode(0), curr = head;
        ListNode prev = temp, next;

        while (curr != null) {
            next = curr.next;
            while (prev.next != null && prev.next.val < curr.val) {
                prev = prev.next;
            }

            curr.next = prev.next;
            prev.next = curr;
            prev = temp;
            curr = next;
        }
        return temp.next;
    }
}
