package com.leetcode.Hard;

import java.util.Arrays;

// 164. Maximum Gap
public class MaximumGap {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;

        Arrays.sort(nums);
        int maxDiff = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            int diff = nums[i + 1] - nums[i];
            maxDiff = Math.max(maxDiff, diff);
        }
        return maxDiff;
    }
}
