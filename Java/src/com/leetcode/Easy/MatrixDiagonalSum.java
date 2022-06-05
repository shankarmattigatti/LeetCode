package com.leetcode.Easy;

// 1572. Matrix Diagonal Sum
public class MatrixDiagonalSum {
    public int diagonalSum(int[][] mat) {
        int len = mat.length, sum = 0;
        for (int i = 0; i < len; i++)
            sum += mat[i][i] + mat[i][len - i - 1];

        return len % 2 == 0 ? sum : sum - mat[len / 2][len / 2];
    }
}
