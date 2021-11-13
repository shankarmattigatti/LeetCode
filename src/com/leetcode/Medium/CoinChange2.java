package com.leetcode.Medium;

// 518. Coin Change 2
public class CoinChange2 {
    public int change(int amount, int[] coins) {
        int size = coins.length;
        int[][] dp = new int[size + 1][amount + 1];

        for (int i = 0; i < size + 1; i++)
            dp[i][0] = 1;

        for (int i = 1; i < size + 1; i++) {
            for (int j = 0; j < amount + 1; j++) {
                if (coins[i - 1] > j)
                    dp[i][j] = dp[i - 1][j];
                else
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
            }
        }

        return dp[size][amount];
    }
}
