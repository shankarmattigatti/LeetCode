package com.leetcode.Easy;

// 70. Climbing Stairs
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        int two = 2;
        int one = 1;
        int three = 0;
        for (int i = 2; i < n; i++) {
            three = one + two;
            one = two;
            two = three;
        }
        return three;
    }
}
