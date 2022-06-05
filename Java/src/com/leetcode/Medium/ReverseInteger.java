package com.leetcode.Medium;

// 7. Reverse Integer
public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0, prev = 0;
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
        while (x != 0) {
            int digit = x % 10;
            rev = rev * 10 + digit;
            if ((rev - digit) / 10 != prev)
                return 0;

            prev = rev;
            x /= 10;
        }
        return rev * sign;
    }
}
