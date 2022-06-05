package com.leetcode.Medium;

// 1015. Smallest Integer Divisible by K
public class SmallestIntegerDivisibleByK {
    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0)
            return -1;
        int r = 0;
        for (int i = 1; i <= k; i++) {
            r = (r * 10 + 2) % k;
            if (r == 0) return i;
        }

        return -1;
    }
}
