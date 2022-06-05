package com.leetcode.Easy;

// 203. Remove Linked List Elements
public class RemoveLinkedListElements {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0);
        ListNode prev = temp, curr = head;
        while (curr != null) {
            if (curr.val != val) {
                prev.next = curr;
                prev = curr;
            }
            curr = curr.next;
        }
        prev.next = null;
        return temp.next;
    }
}
