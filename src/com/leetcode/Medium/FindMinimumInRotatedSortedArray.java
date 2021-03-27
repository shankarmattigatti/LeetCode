package com.leetcode.Medium;

// 153. Find Minimum in Rotated Sorted Array
public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start < end) {
            if(nums[start] < nums[end])
                return nums[start];

            int mid = start + (end - start) / 2;
            if(nums[mid] >= nums[start])
                start = mid + 1;
            else
                end = mid;

        }
        return nums[start];
    }
}
