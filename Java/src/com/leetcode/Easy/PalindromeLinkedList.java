package com.leetcode.Easy;

import java.util.Stack;

// 234. Palindrome Linked List
public class PalindromeLinkedList {
    ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int value) {
            val = value;
            next = null;
        }
    }

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;

        Stack<Integer> stack = new Stack<>();
        ListNode curr = head;
        while (curr != null) {
            stack.push(curr.val);
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            int val = stack.pop();
            if (curr.val != val)
                return false;

            curr = curr.next;
        }
        return true;
    }
}
