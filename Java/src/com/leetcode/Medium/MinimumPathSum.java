package com.leetcode.Medium;

// 64. Minimum Path Sum
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;

        int r = grid.length, c = grid[0].length;
        int[][] dp = new int[r][c];
        dp[0][0] = grid[0][0];

        for (int i = 1; i < r; i++)
            dp[i][0] = dp[i - 1][0] + grid[i][0];

        for (int j = 1; j < c; j++)
            dp[0][j] = dp[0][j - 1] + grid[0][j];

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++)
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
        }

        return dp[r - 1][c - 1];
    }
}
