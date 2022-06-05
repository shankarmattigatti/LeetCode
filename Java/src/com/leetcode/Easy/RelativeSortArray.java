package com.leetcode.Easy;

import java.util.Arrays;

// 1122. Relative Sort Array
public class RelativeSortArray {

    private static int first(int[] arr, int low, int high, int x, int n) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if ((mid == 0 || x > arr[mid - 1]) && arr[mid] == x)
                return mid;
            if (x > arr[mid])
                return first(arr, (mid + 1), high, x, n);
            return first(arr, low, (mid - 1), x, n);
        }
        return -1;
    }

    public int[] relativeSortArray(int[] A1, int[] A2) {
        int m = A1.length, n = A2.length, ind = 0;
        int[] temp = new int[m], visited = new int[m];
        for (int i = 0; i < m; i++) {
            temp[i] = A1[i];
            visited[i] = 0;
        }

        Arrays.sort(temp);
        for (int i : A2) {
            int f = first(temp, 0, m - 1, i, m);
            if (f == -1)
                continue;
            for (int j = f; (j < m && temp[j] == i);
                 j++) {
                A1[ind++] = temp[j];
                visited[j] = 1;
            }
        }

        for (int i = 0; i < m; i++)
            if (visited[i] == 0)
                A1[ind++] = temp[i];

        return A1;
    }
}
