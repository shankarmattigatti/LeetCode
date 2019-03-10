package com.leetcode.Easy;

// 231. Power of Two
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        for (int i = 0; i < n; i++) {
            int p = (int) Math.pow(2.0, i);
            if (p == n)
                return true;
        }
        return false;
    }
}
