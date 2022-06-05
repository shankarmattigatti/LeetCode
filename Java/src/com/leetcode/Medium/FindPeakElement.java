package com.leetcode.Medium;

// 162. Find Peak Element
public class FindPeakElement {

    public int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
}
