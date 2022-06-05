package com.leetcode.Medium;

// 29. Divide Two Integers
public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        if (Math.abs(divisor) == 1) {
            if (divisor > 0) {
                return dividend;
            } else {
                return -dividend;
            }
        }
        long l1 = Math.abs((long) dividend), l2 = Math.abs((long) divisor);
        int sol = 0;
        while (l1 >= l2) {
            long x = l2, y = 1;
            while (l1 >= x) {
                l1 -= x;
                sol += y;
                x += x;
                y += y;
            }
        }

        if (dividend > 0 && divisor < 0 || dividend < 0 && divisor > 0)
            sol = -sol;

        return sol;
    }

}
