package com.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

// 1019. Next Greater Node In Linked List
public class NextGreaterNodeInLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            ListNode node = curr;
            int max = curr.val;
            while (node != null) {
                if (node.val > max) {
                    max = node.val;
                    break;
                }

                node = node.next;
            }

            list.add(max == curr.val ? 0 : max);
            curr = curr.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
