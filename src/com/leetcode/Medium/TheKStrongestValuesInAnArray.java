package com.leetcode.Medium;

import java.util.Arrays;

// 1471. The k Strongest Values in an Array
public class TheKStrongestValuesInAnArray {
    public int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int[] result = new int[k];
        int median = arr[(arr.length - 1) / 2];
        int i = 0, left = 0, right = arr.length - 1;
        while (i < k) {
            if (median - arr[left] > arr[right] - median)
                result[i++] = arr[left++];
            else
                result[i++] = arr[right--];
        }
        return result;
    }
}
