package com.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

// 142. Linked List Cycle II
public class LinkedListCycleII {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        List<ListNode> nodeList = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            if (nodeList.contains(curr)) {
                return curr;
            } else {
                nodeList.add(curr);
            }
            curr = curr.next;
        }
        return null;
    }
}
