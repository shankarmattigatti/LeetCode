package com.leetcode.Easy;

// 258. Add Digits
public class AddDigits {
    public int addDigits(int num) {
        int res = 0;
        while (num > 0) {
            int digit = num % 10;
            res += digit;
            num /= 10;
        }
        if (res < 10) {
            return res;
        } else {
            return addDigits(res);
        }
    }
}
