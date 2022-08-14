package com.leetcode.Medium;

import java.util.*;

// 384. Shuffle an Array
public class ShuffleAnArray {
    private final int[] arr;
    private final Random random;

    public ShuffleAnArray(int[] nums) {
        arr = nums;
        random = new Random();
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        return arr;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        if (arr == null) return null;

        int[] nums = arr.clone();
        for (int i = 0; i < nums.length; i++) {
            int j = random.nextInt(i + 1);
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return nums;
    }
}
