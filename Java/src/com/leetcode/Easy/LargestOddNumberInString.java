package com.leetcode.Easy;

// 1903. Largest Odd Number in String
public class LargestOddNumberInString {
    public String largestOddNumber(String num) {
        int i = num.length() - 1;
        while (i >= 0) {
            int val = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (val % 2 != 0)
                break;

            i--;
        }
        return num.substring(0, i + 1);
    }
}
