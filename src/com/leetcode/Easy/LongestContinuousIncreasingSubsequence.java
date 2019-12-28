package com.leetcode.Easy;

// 674. Longest Continuous Increasing Subsequence
public class LongestContinuousIncreasingSubsequence {

    public int findLengthOfLCIS(int[] nums) {
        if (nums.length <= 0) return 0;

        int max = 1, len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                len++;
            } else {
                if (max < len)
                    max = len;
                len = 1;
            }
        }
        return Math.max(max, len);
    }
}
