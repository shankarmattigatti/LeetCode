package com.leetcode.Easy;

// 35. Search Insert Position
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }

            if (nums[i] < target) {
                index = i + 1;
            }
        }
        return index;
    }
}
