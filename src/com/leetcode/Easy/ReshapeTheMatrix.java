package com.leetcode.Easy;

import java.util.*;

// 566. Reshape the Matrix
public class ReshapeTheMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        List<Integer> list = new ArrayList<>();
        for (int[] ints : mat) {
            for (int j = 0; j < mat[0].length; j++) {
                list.add(ints[j]);
            }
        }
        if (r * c != list.size())
            return mat;

        int k = 0;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = list.get(k++);
            }
        }
        return res;
    }
}
