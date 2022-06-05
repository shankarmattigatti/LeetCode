package com.leetcode.Medium;

import java.util.*;

// 454. 4Sum II
public class FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                int sum = a + b;
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        int count = 0;
        for (int c : C) {
            for (int d : D) {
                int sum = -(c + d);
                if (map.containsKey(sum))
                    count += map.get(sum);
            }
        }
        return count;
    }
}
