package com.leetcode.Easy;


// 832. Flipping an Image
public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int x = A[i].length - 1;
            for (int j = 0; j < x; j++, x--) {
                int temp = A[i][j];
                A[i][j] = A[i][x];
                A[i][x] = temp;
            }

            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 1) {
                    A[i][j] = 0;
                } else {
                    A[i][j] = 1;
                }
            }
        }
        return A;
    }
}
