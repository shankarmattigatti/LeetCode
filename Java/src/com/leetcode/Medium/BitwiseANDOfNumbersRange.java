package com.leetcode.Medium;

// 201. Bitwise AND of Numbers Range
public class BitwiseANDOfNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {
        int i = 0;
        while ((i | m) < n) {
            i = (i << 1) | 1;
        }

        return m & ~i;
    }
}
