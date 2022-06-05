package com.leetcode.Easy;

// 1752. Check if Array Is Sorted and Rotated
public class CheckIfArrayIsSortedAndRotated {
    public boolean check(int[] nums) {
        int k = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n])
                k++;

            if (k > 1)
                return false;
        }
        return true;
    }
}
