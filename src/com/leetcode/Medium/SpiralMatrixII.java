package com.leetcode.Medium;

// 59. Spiral Matrix II
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if (n == 0)
            return matrix;


        int i, k = 0, l = 0, c = matrix[0].length, r = matrix.length;
        int j = 1;
        while (k < r && l < c || j < n * n) {
            for (i = l; i < c; i++) {
                matrix[k][i] = j++;
            }
            k++;

            for (i = k; i < r; i++) {
                matrix[i][c - 1] = j++;
            }
            c--;

            if (k < r) {
                for (i = c - 1; i >= l; i--) {
                    matrix[r - 1][i] = j++;
                }
                r--;
            }

            if (l < c) {
                for (i = r - 1; i >= k; i--) {
                    matrix[i][l] = j++;
                }
                l++;
            }
        }
        return matrix;
    }
}
