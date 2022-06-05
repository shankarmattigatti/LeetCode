package com.leetcode.Medium;

// 213. House Robber II
public class HouseRobberII {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        if (nums.length == 1)
            return nums[0];

        int max1 = helper(nums, 0, nums.length - 2);
        int max2 = helper(nums, 1, nums.length - 1);

        return Math.max(max1, max2);
    }

    private int helper(int[] nums, int i, int j) {
        if (i == j) return nums[i];

        int[] arr = new int[nums.length];
        arr[i] = nums[i];
        arr[i + 1] = Math.max(nums[i + 1], arr[i]);

        for (int k = i + 2; k <= j; k++) {
            arr[k] = Math.max(arr[k - 1], arr[k - 2] + nums[k]);
        }
        return arr[j];
    }
}
