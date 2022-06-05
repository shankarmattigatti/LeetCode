package com.leetcode.Medium;

// 152. Maximum Product Subarray
public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int prod = nums[i];
            max = Math.max(prod, max);
            for (int j = i + 1; j < nums.length; j++) {
                prod *= nums[j];
                if (prod > max) {
                    max = prod;
                }
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max;
    }
}
