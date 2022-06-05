package com.leetcode.Medium;

import java.util.*;

// 347. Top K Frequent Elements
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                new PriorityQueue<>((a, b) -> (b.getValue() - a.getValue()));

        maxHeap.addAll(map.entrySet());

        List<Integer> list = new ArrayList<>();
        while (list.size() < k) {
            Map.Entry<Integer, Integer> entry = maxHeap.poll();
            list.add(entry.getKey());
        }
        return list;
    }
}
