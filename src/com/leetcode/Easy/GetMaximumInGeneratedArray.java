package com.leetcode.Easy;

// 1646. Get Maximum in Generated Array
public class GetMaximumInGeneratedArray {
    public int getMaximumGenerated(int n) {
        if (n < 2) return n;

        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;

        int max = 0;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i / 2];
            if (i % 2 == 1)
                arr[i] += arr[i / 2 + 1];

            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
