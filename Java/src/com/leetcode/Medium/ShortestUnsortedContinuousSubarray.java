package com.leetcode.Medium;

import java.util.*;

// 581. Shortest Unsorted Continuous Subarray
public class ShortestUnsortedContinuousSubarray {
    public int findUnsortedSubarray(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);

        int start = 0, end = nums.length - 1;
        while (start < nums.length && nums[start] == temp[start])
            start++;

        while (end > start && nums[end] == temp[end])
            end--;

        return end - start + 1;
    }
}
