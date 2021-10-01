package com.leetcode.Easy;

// 1929. Concatenation of Array
public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[nums.length * 2];
        int i = 0, j = 0;
        while (j < nums.length)
            res[i++] = nums[j++];

        j = 0;
        while (j < nums.length)
            res[i++] = nums[j++];

        return res;
    }
}
