package com.leetcode.Easy;

// 5291. Find Numbers with Even Number of Digits
public class FindNumbersWithEvenNumberOfDigits {
    static boolean evenDigits(int num) {
        int digits = 0;
        while (num != 0) {
            digits++;
            num /= 10;
        }
        return digits % 2 == 0;
    }

    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (evenDigits(i))
                count++;
        }
        return count;
    }
}
