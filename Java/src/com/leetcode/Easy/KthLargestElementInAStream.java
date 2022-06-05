package com.leetcode.Easy;

import java.util.*;

// 703. Kth Largest Element in a Stream
public class KthLargestElementInAStream {
    private final int k;
    private final PriorityQueue<Integer> minHeap;

    public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>(k);
        for (int num : nums)
            add(num);
    }

    public int add(int val) {
        if (minHeap.size() < k) {
            minHeap.offer(val);
        } else if (minHeap.peek() < val) {
            minHeap.poll();
            minHeap.offer(val);
        }
        return minHeap.peek();
    }
}
