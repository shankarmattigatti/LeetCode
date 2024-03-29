package com.leetcode.Easy;

// 1480. Running Sum of 1d Array
public class RunningSumOf1dArray {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }
        return nums;
    }
}
