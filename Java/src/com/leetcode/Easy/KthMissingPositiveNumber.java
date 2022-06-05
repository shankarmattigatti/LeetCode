package com.leetcode.Easy;

// 1539. Kth Missing Positive Number
public class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (arr[mid] - mid - 1 < k)
                left = mid + 1;
            else
                right = mid;
        }
        return left + k;
    }
}
