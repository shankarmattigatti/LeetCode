package com.leetcode.Easy;

// 172. Factorial Trailing Zeroes
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        int countZeros = 0;
        while (n > 0) {
            n /= 5;
            countZeros += n;
        }
        return countZeros;
    }
}
