package com.leetcode.Medium;

import java.util.*;

// 1481. Least Number of Unique Integers after K Removals
public class LeastNumberOfUniqueIntegersAfterKRemovals {
    public int findLeastNumOfUniqueInts(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparing(map::get));
        pq.addAll(map.keySet());
        while (k > 0)
            k -= map.get(pq.poll());

        return k < 0 ? pq.size() + 1 : pq.size();
    }
}
