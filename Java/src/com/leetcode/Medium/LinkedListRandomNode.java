package com.leetcode.Medium;

import java.util.Random;

// 382. Linked List Random Node
public class LinkedListRandomNode {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    private final ListNode root;
    private final Random random;

    public LinkedListRandomNode(ListNode head) {
        root = head;
        random = new Random();
    }

    /**
     * Returns a random node's value.
     */
    public int getRandom() {
        ListNode curr = root;
        int val = curr.val;
        for (int i = 1; curr.next != null; i++) {
            curr = curr.next;
            if (random.nextInt(i + 1) == i)
                val = curr.val;
        }
        return val;
    }
}
