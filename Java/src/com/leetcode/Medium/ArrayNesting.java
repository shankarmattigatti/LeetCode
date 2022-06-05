package com.leetcode.Medium;

// 565. Array Nesting
public class ArrayNesting {
    public int arrayNesting(int[] nums) {
        int result = 0;
        boolean[] seen = new boolean[nums.length];
        for (int num : nums) {
            int count = 0;
            while (!seen[num]) {
                seen[num] = true;
                count++;
                num = nums[num];
            }
            result = Math.max(result, count);
        }
        return result;
    }
}
