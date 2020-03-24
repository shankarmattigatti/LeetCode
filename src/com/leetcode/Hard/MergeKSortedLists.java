package com.leetcode.Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 23. Merge k Sorted Lists
public class MergeKSortedLists {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;

        List<Integer> list = new ArrayList<>();
        for (ListNode node : lists) {
            ListNode curr = node;
            while (curr != null) {
                list.add(curr.val);
                curr = curr.next;
            }
        }

        Collections.sort(list);
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        for (int i : list) {
            ListNode node = new ListNode(i);
            curr = curr.next;
        }
        return temp.next;
    }
}
