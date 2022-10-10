package com.leetcode.Medium;

// 633. Sum of Square Numbers
public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        if (c < 0) return false;

        int left = 0, right = (int) Math.sqrt(c);
        while (left <= right) {
            int num = (left * left) + (right * right);
            if (num == c)
                return true;
            else if (num < c)
                left++;
            else
                right--;
        }
        return false;
    }
}
