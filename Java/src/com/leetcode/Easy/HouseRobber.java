package com.leetcode.Easy;

// 198. House Robber
public class HouseRobber {

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int n = nums.length;
        int[] arr = new int[n + 1];
        arr[1] = nums[0];
        arr[2] = Math.max(nums[0], nums[1]);

        for (int i = 3; i <= n; i++) {
            arr[i] = Math.max(nums[i - 1] + arr[i - 2], arr[i - 1]);
        }
        return arr[n];
    }
}
