package com.leetcode.Medium;

import java.util.*;

public class LargestDivisibleSubset {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int[] parent = new int[nums.length];
        int[] count = new int[nums.length];
        int max = 0, maxIndex = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] % nums[i] == 0 && count[i] < 1 + count[j]) {
                    count[i] = 1 + count[j];
                    parent[i] = j;
                    if (count[i] > max) {
                        max = count[i];
                        maxIndex = i;
                    }
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < max; i++) {
            res.add(nums[maxIndex]);
            maxIndex = parent[maxIndex];
        }
        return res;
    }
}
