package com.leetcode.Medium;

// 991. Broken Calculator
public class BrokenCalculator {
    public int brokenCalc(int startValue, int target) {
        int result = 0;
        while (target > startValue) {
            target = target % 2 > 0 ? target + 1 : target / 2;
            result++;
        }
        return result + startValue - target;
    }
}
