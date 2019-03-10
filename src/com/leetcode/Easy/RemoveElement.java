package com.leetcode.Easy;

// 27. Remove Element
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int newLength = nums.length;
        for (int i = 0; i < newLength; i++) {
            if (nums[i] == val) {
                nums[i--] = nums[--newLength];
            }
        }
        return newLength;
    }
}
