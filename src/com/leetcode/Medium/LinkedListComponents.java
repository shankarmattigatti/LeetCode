package com.leetcode.Medium;

import java.util.HashSet;
import java.util.Set;

// 817. Linked List Components
public class LinkedListComponents {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet<>();
        for (int i : G)
            set.add(i);

        int res = 0;
        while (head != null) {
            if (set.contains(head.val) && (head.next == null || !set.contains(head.next.val)))
                res++;

            head = head.next;
        }
        return res;
    }
}
