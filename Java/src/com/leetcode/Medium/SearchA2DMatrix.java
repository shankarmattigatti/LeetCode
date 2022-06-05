package com.leetcode.Medium;

// 74. Search a 2D Matrix
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] ints : matrix) {
            int low = 0, high = ints.length - 1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (ints[mid] == target) {
                    return true;
                } else if (target < ints[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return false;
    }
}
