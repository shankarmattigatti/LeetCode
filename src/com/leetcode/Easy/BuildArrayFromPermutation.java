package com.leetcode.Easy;

// 1920. Build Array from Permutation
public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            res[i] = nums[nums[i]];

        return res;
    }
}
