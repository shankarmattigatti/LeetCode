package com.leetcode.Easy;

import java.util.Stack;

// 206. Reverse Linked List
public class ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;

        Stack<ListNode> stack = new Stack<>();
        ListNode curr = head;
        while (curr.next != null) {
            stack.push(curr);
            curr = curr.next;
        }

        head = curr;
        while (!stack.isEmpty()) {
            curr.next = stack.pop();
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
}
