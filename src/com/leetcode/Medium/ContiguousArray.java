package com.leetcode.Medium;

// 525. Contiguous Array
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int max = 0, count = 0;
        for (int i = 0; i < nums.length; i += 2) {
            if (i + 1 >= nums.length)
                break;
            if (nums[i] == 0 && nums[i + 1] == 1) {
                count += 2;
            } else {
                max = Math.max(count, max);
            }
        }

        return Math.max(count, max);
    }
}
