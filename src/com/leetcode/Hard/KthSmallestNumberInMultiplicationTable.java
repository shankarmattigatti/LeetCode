package com.leetcode.Hard;

// 668. Kth Smallest Number in Multiplication Table
public class KthSmallestNumberInMultiplicationTable {
    public int findKthNumber(int m, int n, int k) {
        int low = 1, high = m * n + 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = getCount(mid, m, n);
            if (count >= k)
                high = mid;
            else
                low = mid + 1;
        }

        return high;
    }

    private int getCount(int x, int m, int n) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            int temp = Math.min(x / i, n);
            count += temp;
        }
        return count;
    }
}
