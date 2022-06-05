package com.leetcode.Easy;

// 905. Sort Array By Parity
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] A) {
        int[] arr = new int[A.length];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                arr[count++] = A[i];
            }
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 != 0) {
                arr[count++] = A[i];
            }
        }
        return arr;
    }
}
