package com.leetcode.Easy;

import java.util.*;

// 1619. Mean of Array After Removing Some Elements
public class MeanOfArrayAfterRemovingSomeElements {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length, sum = 0;
        for (int i = n / 20; i < n - n / 20; i++)
            sum += arr[i];

        return sum / (n * 9d / 10);
    }
}
