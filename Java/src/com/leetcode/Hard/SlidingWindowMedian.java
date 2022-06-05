package com.leetcode.Hard;

import java.util.Collections;
import java.util.PriorityQueue;

// 480. Sliding Window Median
public class SlidingWindowMedian {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] result = new double[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
            if (maxHeap.isEmpty() || maxHeap.peek() >= nums[i])
                maxHeap.add(nums[i]);
            else
                minHeap.add(nums[i]);

            rebalancedHeaps();

            if (i - k + 1 >= 0) {
                if (maxHeap.size() == minHeap.size())
                    result[i - k + 1] = maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;
                else
                    result[i - k - 1] = maxHeap.peek();

                int elementToBeRemoved = nums[i - k + 1];
                if (elementToBeRemoved <= maxHeap.peek())
                    maxHeap.remove(elementToBeRemoved);
                else
                    minHeap.remove(elementToBeRemoved);

                rebalancedHeaps();
            }
        }

        return result;
    }

    private void rebalancedHeaps() {
        if (maxHeap.size() > minHeap.size() + 1)
            minHeap.add(maxHeap.poll());
        else if (maxHeap.size() < minHeap.size())
            maxHeap.add(minHeap.poll());
    }
}
