package com.leetcode.Medium;

// 322. Coin Change
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        if(amount < 1)  return 0;

        int sum = 0;
        int[] dp = new int[amount + 1];
        while(++sum <= amount) {
            int min = -1;
            for(int coin : coins) {
                if(sum >= coin && dp[sum - coin] != -1) {
                    int temp = dp[sum - coin] + 1;
                    min = min < 0 ? temp : (Math.min(temp, min));
                }
            }
            dp[sum] = min;
        }
        return dp[amount];
    }
}
