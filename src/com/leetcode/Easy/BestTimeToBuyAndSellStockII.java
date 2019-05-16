package com.leetcode.Easy;

// 122. Best Time to Buy and Sell Stock II
public class BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int maxProfit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                maxProfit += prices[i + 1] - prices[i];
            }
        }
        return maxProfit;
    }
}
