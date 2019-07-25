package com.leetcode.Easy;

// 896. Monotonic Array
public class MonotonicArray {
    public boolean isMonotonic(int[] A) {
        boolean increasing = false, decreasing = false;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] > A[i]) {
                if (increasing) return false;
                decreasing = true;
            }

            if (A[i - 1] < A[i]) {
                if (decreasing) return false;
                increasing = true;
            }
        }
        return true;
    }
}
