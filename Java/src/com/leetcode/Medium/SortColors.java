package com.leetcode.Medium;

// 75. Sort Colors
public class SortColors {
    public void sortColors(int[] nums) {
        int i = 0, j = nums.length - 1;
        for (int k = i; k <= j; k++) {
            if (nums[k] == 0) {
                nums[k] = nums[i];
                nums[i++] = 0;
            }
            if (nums[k] == 2) {
                nums[k] = nums[j];
                nums[j--] = 2;
                k--;
            }
        }
    }
}
