package com.leetcode.Easy;

// 941. Valid Mountain Array
public class ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        int i = 0, n = A.length;

        // walk up
        while (i + 1 < n && A[i] < A[i + 1])
            i++;

        // peak can't be first or last
        if (i == 0 || i == n - 1)
            return false;

        // walk down
        while (i + 1 < n && A[i] > A[i + 1])
            i++;

        return i == n - 1;
    }
}
