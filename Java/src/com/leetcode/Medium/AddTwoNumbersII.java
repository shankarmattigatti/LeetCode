package com.leetcode.Medium;

import java.util.Stack;

// 445. Add Two Numbers II
public class AddTwoNumbersII {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();

        while (l1 != null) {
            s1.push(l1);
            l1 = l1.next;
        }

        while (l2 != null) {
            s2.push(l2);
            l2 = l2.next;
        }

        ListNode list = new ListNode(0);
        int sum = 0;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            if (!s1.isEmpty()) sum += s1.pop().val;
            if (!s2.isEmpty()) sum += s2.pop().val;

            list.val = sum % 10;
            ListNode temp = new ListNode(sum / 10);
            temp.next = list;
            list = temp;
            sum /= 10;
        }
        return list.val == 0 ? list.next : list;
    }
}
