package com.leetcode.Medium;

import java.util.*;

// 373. Find K Pairs with Smallest Sums
public class FindKPairsWithSmallestSums {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        PriorityQueue<Integer[]> maxHeap = new PriorityQueue<>((a, b) -> (b[0] + b[1]) - (a[0] + a[1]));
        for (int value : nums1) {
            for (int i : nums2) {
                if (maxHeap.size() < k) {
                    maxHeap.add(new Integer[]{value, i});
                } else {
                    Integer[] arr = maxHeap.peek();
                    int sum1 = value + i;
                    int sum2 = arr[0] + arr[1];
                    if (sum1 < sum2) {
                        maxHeap.poll();
                        maxHeap.add(new Integer[]{value, i});
                    }
                }
            }
        }

        int size = maxHeap.size();
        for (int i = 0; i < size; i++) {
            Integer[] arr = maxHeap.poll();
            res.add(Arrays.asList(arr));
        }

        return res;
    }
}
