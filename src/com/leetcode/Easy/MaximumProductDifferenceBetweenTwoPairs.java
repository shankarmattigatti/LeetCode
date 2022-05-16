package com.leetcode.Easy;

import java.util.*;

// 1913. Maximum Product Difference Between Two Pairs
public class MaximumProductDifferenceBetweenTwoPairs {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int pair1 = nums[n] * nums[n - 1];
        int pair2 = nums[0] * nums[1];

        return pair1 - pair2;
    }
}
