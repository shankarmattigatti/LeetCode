package com.leetcode.Easy;

// 303. Range Sum Query - Immutable
public class RangeSumQuery {
    private final int[] nums;

    public RangeSumQuery(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];

        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        if (left == 0) return nums[right];

        return nums[right] - nums[left - 1];
    }
}
