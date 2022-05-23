package com.leetcode.Medium;

// 80. Remove Duplicates from Sorted Array II
public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2)
            return nums.length;

        int i = 1, j = 2;
        while (j < nums.length) {
            if (nums[j] == nums[i] && nums[j] == nums[i - 1])
                j++;
            else
                nums[++i] = nums[j++];
        }
        return i + 1;
    }
}
