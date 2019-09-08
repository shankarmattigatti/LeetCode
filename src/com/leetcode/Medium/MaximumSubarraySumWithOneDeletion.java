package com.leetcode.Medium;

// 5182. Maximum Subarray Sum with One Deletion
public class MaximumSubarraySumWithOneDeletion {
    public int maximumSum(int[] arr) {
        int[] fw = new int[arr.length];
        int[] bw = new int[arr.length];

        int curMax = arr[0], maxSoFar = arr[0];

        fw[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            curMax = Math.max(arr[i], curMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, curMax);
            fw[i] = curMax;
        }

        curMax = maxSoFar = bw[arr.length - 1] = arr[arr.length - 1];

        for (int i = arr.length - 2; i >= 0; i--) {
            curMax = Math.max(arr[i], curMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, curMax);
            bw[i] = curMax;
        }

        int result = maxSoFar;

        for (int i = 1; i < arr.length - 1; i++)
            result = Math.max(result, fw[i - 1] + bw[i + 1]);

        return result;
    }
}
