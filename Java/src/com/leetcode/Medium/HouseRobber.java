package com.leetcode.Medium;

// 198. House Robber
public class HouseRobber {
    public int rob(int[] nums) {
        int oddSum = 0, evenSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                evenSum += nums[i];
                evenSum = Math.max(evenSum, oddSum);
            } else {
                oddSum += nums[i];
                oddSum = Math.max(evenSum, oddSum);
            }
        }
        return Math.max(evenSum, oddSum);
    }
}
