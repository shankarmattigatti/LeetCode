package com.leetcode.Hard;

import java.util.ArrayList;
import java.util.List;

// 239. Sliding Window Maximum
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        if (nums.length == 0 || k <= 0)
            return list.stream().mapToInt(i -> i).toArray();

        for (int i = 0; i < nums.length - k + 1; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k; j++) {
                max = Math.max(nums[j], max);
            }
            list.add(max);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
