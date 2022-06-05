package com.leetcode.Easy;

import java.util.*;

// 1046. Last Stone Weight
public class LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones)
            pq.offer(i);

        while (pq.size() > 1) {
            int max1 = pq.poll();
            int max2 = pq.poll();

            if (max1 - max2 > 0)
                pq.offer(max1 - max2);
        }

        return pq.size() > 0 ? pq.poll() : 0;
    }
}
