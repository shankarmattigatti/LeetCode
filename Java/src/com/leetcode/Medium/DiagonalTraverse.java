package com.leetcode.Medium;

// 498. Diagonal Traverse
public class DiagonalTraverse {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0)
            return new int[0];

        int m = matrix.length, n = matrix[0].length;
        int[] arr = new int[m * n];
        int r = 0, c = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = matrix[r][c];
            if ((r + c) % 2 == 0) {
                if (c == n - 1) {
                    r++;
                } else if (r == 0) {
                    c++;
                } else {
                    r--;
                    c++;
                }
            } else {
                if (r == m - 1) {
                    c++;
                } else if (c == 0) {
                    r++;
                } else {
                    r++;
                    c--;
                }
            }
        }

        return arr;
    }
}
