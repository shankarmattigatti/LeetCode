package com.leetcode.Medium;

import java.util.*;

// 1695. Maximum Erasure Value
public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        int i = 0, j = 1, sum = nums[0];
        int maxSum = sum;

        while (i < nums.length - 1 && j < nums.length) {
            if(!set.contains(nums[j])) {
                sum += nums[j];
                maxSum = Math.max(sum, maxSum);
                set.add(nums[j++]);
            } else {
                sum -= nums[i];
                set.remove(nums[i++]);
            }
        }
        return maxSum;
    }
}
