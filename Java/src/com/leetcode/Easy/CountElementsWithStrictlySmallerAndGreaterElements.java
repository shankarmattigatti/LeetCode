package com.leetcode.Easy;

// 2148. Count Elements With Strictly Smaller and Greater Elements
public class CountElementsWithStrictlySmallerAndGreaterElements {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int count = 0;
        for (int num : nums) {
            if (num > min && num < max)
                count++;
        }
        return count;
    }
}
