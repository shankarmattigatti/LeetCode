package com.leetcode.Easy;

import java.util.Arrays;

// 1672. Richest Customer Wealth
public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = Integer.MIN_VALUE;
        for (int[] account : accounts) {
            int wealth = Arrays.stream(account).sum();
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }
}
