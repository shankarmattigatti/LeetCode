package com.leetcode.Easy;

// 461. Hamming Distance
public class HammingDistance {

    public int hammingDistance(int x, int y) {
        int[] a = new int[32];
        int[] b = new int[32];

        int i = 0, j = 0, count = 0;
        while (x > 0) {
            a[i] = x % 2;
            x /= 2;
            i++;
        }

        while (y > 0) {
            b[j] = y % 2;
            y /= 2;
            j++;
        }

        for (i = 31; i >= 0; i--) {
            if (a[i] != b[i])
                count++;
        }
        return count;
    }
}
