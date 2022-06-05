package com.leetcode.Easy;

// 747. Largest Number At Least Twice of Others
public class LargestNumberAtLeastTwiceOofOthers {
    public int dominantIndex(int[] nums) {
        int max = 0, maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }
        }

        for (int num : nums) {
            if (num != max && max < (2 * num))
                return -1;
        }
        return maxIndex;
    }
}
