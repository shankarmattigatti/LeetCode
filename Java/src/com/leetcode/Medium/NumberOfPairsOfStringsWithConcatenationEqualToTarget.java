package com.leetcode.Medium;

// 2023. Number of Pairs of Strings With Concatenation Equal to Target
public class NumberOfPairsOfStringsWithConcatenationEqualToTarget {
    public int numOfPairs(String[] nums, String target) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                StringBuilder sb = new StringBuilder(nums[i]).append(nums[j]);
                if (i != j && sb.toString().equals(target))
                    count++;
            }
        }
        return count;
    }
}
