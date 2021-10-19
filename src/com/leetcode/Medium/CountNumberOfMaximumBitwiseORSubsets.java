package com.leetcode.Medium;

// 2044. Count Number of Maximum Bitwise-OR Subsets
public class CountNumberOfMaximumBitwiseORSubsets {
    private int result = 0, target = 0;

    public int countMaxOrSubsets(int[] nums) {
        for (int num : nums)
            target |= num;

        dfs(nums, 0, 0);
        return result;
    }

    private void dfs(int[] arr, int index, int mask) {
        if (mask == target) result++;

        for (int i = index; i < arr.length; i++)
            dfs(arr, i + 1, mask | arr[i]);
    }
}
