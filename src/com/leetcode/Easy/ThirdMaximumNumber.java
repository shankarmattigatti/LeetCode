package com.leetcode.Easy;

import java.util.*;

// 414. Third Maximum Number
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            if (!minHeap.contains(num)) {
                minHeap.offer(num);
                if (minHeap.size() > 3)
                    minHeap.poll();
            }
        }

        if (minHeap.size() < 3) {
            while (minHeap.size() > 1)
                minHeap.poll();
        }
        return minHeap.peek();
    }
}
