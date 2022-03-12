package com.leetcode.Easy;

// 326. Power of Three
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        while (n != 0 && n % 3 == 0)
            n /= 3;

        return n == 1;
    }
}
