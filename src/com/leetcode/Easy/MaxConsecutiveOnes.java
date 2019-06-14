package com.leetcode.Easy;

// 485. Max Consecutive Ones
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                maxCount = count > maxCount ? count : maxCount;
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}
