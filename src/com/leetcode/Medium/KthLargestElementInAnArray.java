package com.leetcode.Medium;

import java.util.Arrays;

// 215. Kth Largest Element in an Array
public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        if (nums.length == 0)
            return -1;

        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
