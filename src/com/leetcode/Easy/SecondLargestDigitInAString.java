package com.leetcode.Easy;

// 1796. Second Largest Digit in a String
public class SecondLargestDigitInAString {
    public int secondHighest(String s) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                int digit = Integer.parseInt(String.valueOf(ch));
                if (digit > max) {
                    secondMax = max;
                    max = digit;
                } else if (digit > secondMax && digit != max) {
                    secondMax = digit;
                }
            }
        }
        return secondMax == Integer.MIN_VALUE ? -1 : secondMax;
    }
}
