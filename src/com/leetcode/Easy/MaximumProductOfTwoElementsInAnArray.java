package com.leetcode.Easy;

import java.util.Arrays;

// 1464. Maximum Product of Two Elements in an Array
public class MaximumProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int i = nums[n] - 1, j = nums[n - 1] - 1;

        return i * j;
    }
}
