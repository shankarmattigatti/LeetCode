package com.leetcode.Easy;

// 2057. Smallest Index With Equal Value
public class SmallestIndexWithEqualValue {
    public int smallestEqual(int[] nums) {
        int len = nums.length, minIndex = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {
            int mod = i % 10;
            if (mod < len && mod == nums[i]) {
                minIndex = Math.min(minIndex, i);
            }
        }
        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
}
