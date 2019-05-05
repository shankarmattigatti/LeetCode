package com.leetcode.Medium;

// 338. Counting Bits
public class CountingBits {
    static int decimalToBinary(int x) {
        int countOnes = 0;
        while (x > 0) {
            int digit = x % 2;
            if (digit == 1)
                countOnes++;
            x /= 2;
        }
        return countOnes;
    }

    public int[] countBits(int num) {
        int[] arr = new int[++num];
        for (int i = 0; i < num; i++) {
            arr[i] = decimalToBinary(i);
        }
        return arr;
    }
}
