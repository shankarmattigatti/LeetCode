package com.leetcode.Easy;

// 237. Delete ListNode in a Linked List
public class DeleteNode {

    ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int value) {
            val = value;
            next = null;
        }
    }

    public void deleteNode(ListNode listNode) {
        listNode.val = listNode.next.val;
        listNode.next = listNode.next.next;
    }
}
