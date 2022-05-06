package com.leetcode.Easy;

// 1486. XOR Operation in an Array
public class XOROperationInAnArray {
    public int xorOperation(int n, int start) {
        int result = start;
        for (int i = 1; i < n; i++)
            result ^= start + 2 * i;

        return result;
    }
}
