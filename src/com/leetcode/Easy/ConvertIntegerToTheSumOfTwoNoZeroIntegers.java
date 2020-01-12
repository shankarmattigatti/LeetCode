package com.leetcode.Easy;

// 5307. Convert Integer to the Sum of Two No-Zero Integers
public class ConvertIntegerToTheSumOfTwoNoZeroIntegers {
    static boolean contansZero(int num) {
        while (num != 0) {
            int digit = num % 10;
            if (digit == 0)
                return false;
            num /= 10;
        }
        return true;
    }

    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            int b = n - i;
            if (contansZero(i) && contansZero(b)) {
                return new int[]{i, b};
            }
        }
        return new int[]{-1, -1};
    }
}
