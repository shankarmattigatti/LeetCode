package com.leetcode.Medium;

// 24. Swap Nodes in Pairs
public class SwapNodesInPairs {
    public static class ListNode {
        int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode swapPairs(ListNode head) {
        ListNode node = new ListNode(0);
        node.next = head;
        ListNode curr = node;
        while (curr.next != null && curr.next.next != null) {
            ListNode first = curr.next;
            ListNode second = curr.next.next;
            first.next = second.next;
            curr.next = second;
            curr.next.next = first;
            curr = curr.next.next;
        }
        return node.next;
    }
}
