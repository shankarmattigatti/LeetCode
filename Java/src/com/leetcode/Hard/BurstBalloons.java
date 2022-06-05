package com.leetcode.Hard;

public class BurstBalloons {
    public int maxCoins(int[] nums) {
        int[] arr = new int[nums.length + 2];
        arr[0] = 1;
        arr[arr.length - 1] = 1;
        System.arraycopy(nums, 0, arr, 1, nums.length);

        int[][] dp = new int[arr.length][arr.length];
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = i; j >= 1; j--) {
                for (int k = j; k <= i; k++) {
                    dp[j][i] = Math.max(arr[j - 1] * arr[k] * arr[i + 1] + dp[j][k - 1] + dp[k + 1][i], dp[j][i]);
                }
            }
        }

        return dp[1][arr.length - 2];
    }
}
