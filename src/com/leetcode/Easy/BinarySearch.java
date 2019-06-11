package com.leetcode.Easy;

// 704. Binary Search
public class BinarySearch {

    public int search(int[] nums, int target) {
        int l = 0, h = nums.length - 1, mid;
        while (l <= h) {
            mid = (l + h) / 2;
            if (nums[mid] == target)
                return mid;
            else if (target < nums[mid])
                h = mid - 1;
            else
                l = mid + 1;
        }
        return -1;
    }
}
