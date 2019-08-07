package com.leetcode.Easy;

import java.util.HashSet;

// 202. Happy Number
public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (set.add(n)) {
            int sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += Math.pow(digit, 2);
                n /= 10;
            }
            if (sum == 1)
                return true;
            else
                n = sum;
        }
        return false;
    }
}
