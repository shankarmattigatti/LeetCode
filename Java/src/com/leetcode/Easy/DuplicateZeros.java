package com.leetcode.Easy;

// 1089. Duplicate Zeros
public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        int[] a = arr.clone();
        int i = 0, j = 0;
        while (i < arr.length) {
            if (a[j] == 0) {
                arr[i] = 0;
                if (i != arr.length - 1)
                    arr[++i] = 0;
            } else {
                arr[i] = a[j];
            }
            i++;
            j++;
        }
    }
}
