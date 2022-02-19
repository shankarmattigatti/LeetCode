package com.leetcode.Hard;

import java.util.PriorityQueue;

public class MinimizeDeviationInArray {
    public int minimumDeviation(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int res = Integer.MAX_VALUE, min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num % 2 == 1)
                num *= 2;

            pq.add(-num);
            min = Math.min(min, num);
        }
        while (true) {
            int a = -pq.poll();
            res = Math.min(res, a - min);
            if (a % 2 == 1)
                break;

            min = Math.min(min, a / 2);
            pq.add(-a / 2);
        }
        return res;
    }
}
