package com.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

// 54 Spiral Matrix
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return list;

        int i, k = 0, l = 0, c = matrix[0].length, r = matrix.length;

        while (k < r && l < c) {
            for (i = l; i < c; i++) {
                list.add(matrix[k][i]);
            }
            k++;

            for (i = k; i < r; i++) {
                list.add(matrix[i][c - 1]);
            }
            c--;

            if (k < r) {
                for (i = c - 1; i >= l; i--) {
                    list.add(matrix[r - 1][i]);
                }
                r--;
            }

            if (l < c) {
                for (i = r - 1; i >= k; i--) {
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }
        return list;
    }
}
