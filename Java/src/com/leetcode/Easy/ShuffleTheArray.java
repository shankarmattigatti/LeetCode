package com.leetcode.Easy;

import java.util.*;

// 1470. Shuffle the Array
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0, j = n; i < n && j < nums.length; i++, j++) {
            result.add(nums[i]);
            result.add(nums[j]);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
