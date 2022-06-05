package com.leetcode.Medium;

import java.util.*;

// 1865. Finding Pairs With a Certain Sum
public class FindingPairsWithACertainSum {
    private final int[] nums1;
    private final int[] nums2;
    private final Map<Integer, Integer> map;

    public FindingPairsWithACertainSum(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        map = new HashMap<>();

        for (int num : nums2) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }

    public void add(int index, int val) {
        map.put(nums2[index], map.getOrDefault(nums2[index], 0) - 1);
        nums2[index] += val;
        map.put(nums2[index], map.getOrDefault(nums2[index], 0) + 1);
    }

    public int count(int tot) {
        int res = 0;
        for (int num : nums1) {
            res += map.getOrDefault(tot - num, 0);
        }
        return res;
    }
}
