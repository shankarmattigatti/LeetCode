package com.leetcode.Hard;

import java.util.PriorityQueue;

// 295. Find Median from Data Stream
public class FindMedianFromDataStream {
    private PriorityQueue<Integer> minHeap;
    private PriorityQueue<Integer> maxHeap;

    public FindMedianFromDataStream() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a, b) -> b - a);
    }

    public void addNum(int num) {
        if (maxHeap.isEmpty() || maxHeap.peek() > num)
            maxHeap.offer(num);
        else
            minHeap.offer(num);

        if (maxHeap.size() > minHeap.size() + 1)
            minHeap.offer(maxHeap.poll());
        if (maxHeap.size() < minHeap.size())
            maxHeap.offer(minHeap.poll());
    }

    public double findMedian() {
        if (minHeap.size() == maxHeap.size())
            return (minHeap.peek() / 2.0) + maxHeap.peek() / 2.0;

        return maxHeap.peek();
    }
}
