package com.leetcode.Easy;

// 338. Counting Bits
public class CountingBits {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        for (int i = 0; i <= num; i++) {
            result[i] = countEachBits(i);
        }
        return result;
    }

    private int countEachBits(int n) {
        int count = 0;
        while (n != 0) {
            if (n % 2 == 1)
                count++;

            n /= 2;
        }
        return count;
    }
}
