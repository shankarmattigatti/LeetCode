package com.leetcode.Easy;

import java.util.Arrays;

// 628. Maximum Product of Three Numbers
public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        if (n < 3)
            return -1;

        Arrays.sort(nums);

        return Math.max(nums[0] * nums[1] * nums[n - 1],
                nums[n - 1] * nums[n - 2] * nums[n - 3]);
    }
}
