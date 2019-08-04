package com.leetcode.Medium;

// 300. Longest Increasing Subsequence
public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        if (nums.length <= 0)
            return 0;

        int i, j;
        int[] lis = new int[nums.length];

        for (i = 0; i < nums.length; i++) {
            lis[i] = 1;
        }

        for (i = 1; i < nums.length; i++) {
            for (j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;
            }
        }

        int max = lis[0];
        for (i = 0; i < nums.length; i++) {
            if (lis[i] > max)
                max = lis[i];
        }

        return max;
    }
}
