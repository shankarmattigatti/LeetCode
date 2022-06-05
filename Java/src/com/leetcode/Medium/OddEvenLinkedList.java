package com.leetcode.Medium;

// 328. Odd Even Linked List
public class OddEvenLinkedList {
    ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int value) {
            val = value;
            next = null;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        ListNode curr = head;

        ListNode oddList = new ListNode(0);
        ListNode oddCurr = oddList;

        ListNode evenList = new ListNode(0);
        ListNode evenCurr = evenList;

        int i = 1;
        while (curr != null) {
            if (i % 2 == 0) {
                evenCurr.next = curr;
                evenCurr = evenList.next;
            } else {
                oddCurr.next = curr;
                oddCurr = oddList.next;
            }
            i++;
            curr = curr.next;
        }
        evenCurr.next = null;
        oddCurr.next = evenList.next;

        return oddList.next;

    }
}
