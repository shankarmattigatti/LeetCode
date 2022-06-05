package com.leetcode.Easy;

// 1475. Final Prices With a Special Discount in a Shop
public class FinalPricesWithASpecialDiscountInAShop {
    public int[] finalPrices(int[] prices) {
        if (prices.length == 0)
            return prices;

        int n = prices.length, k = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            boolean isFound = false;
            for (int j = i + 1; j < n; j++) {
                if (prices[j] <= prices[i]) {
                    result[k++] = prices[i] - prices[j];
                    isFound = true;
                    break;
                }
            }
            if (!isFound)
                result[k++] = prices[i];
        }
        return result;
    }
}
