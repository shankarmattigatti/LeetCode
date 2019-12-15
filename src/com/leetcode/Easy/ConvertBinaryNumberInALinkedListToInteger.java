package com.leetcode.Easy;

// 5283. Convert Binary Number in a Linked List to Integer
public class ConvertBinaryNumberInALinkedListToInteger {
    public static class ListNode {
        int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        StringBuilder sb = new StringBuilder();
        while (curr != null) {
            sb.append(curr.val);
            curr = curr.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
