package com.leetcode.Easy;

// 121. Best Time to Buy and Sell Stock
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;

        int maxProfit = 0, minStock = prices[0];
        for (int price : prices) {
            if (price > minStock) {
                maxProfit = Math.max(maxProfit, price - minStock);
            } else {
                minStock = price;
            }
        }
        return maxProfit;
    }
}
