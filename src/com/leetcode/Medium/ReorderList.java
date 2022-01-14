package com.leetcode.Medium;

// 143. Reorder List
public class ReorderList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private ListNode reverse(ListNode slow) {
        ListNode prev = null;
        while (slow != null) {
            ListNode node = slow.next;
            slow.next = prev;
            prev = slow;
            slow = node;
        }
        return prev;
    }

    public void reorderList(ListNode head) {
        if (head == null)
            return;

        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode headOfFirst = head;
        ListNode headOfSecond = reverse(slow);

        while (headOfFirst != null && headOfSecond != null) {
            ListNode temp = headOfFirst.next;
            headOfFirst.next = headOfSecond;
            headOfFirst = temp;

            temp = headOfSecond.next;
            headOfSecond.next = headOfFirst;
            headOfSecond = temp;
        }

        if (headOfFirst != null)
            headOfFirst.next = null;
    }
}
