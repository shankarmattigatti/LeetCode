package com.leetcode.Medium;

import java.util.*;

// 658. Find K Closest Elements
public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> res = new ArrayList<>();
        int left = 0, right = arr.length - k;
        while (left < right) {
            int mid = (left + right) / 2;
            if ((x - arr[mid]) > (arr[mid + k] - x))
                left = mid + 1;
            else
                right = mid;
        }

        for (int i = left; i < left + k; i++) {
            res.add(arr[i]);
        }
        return res;
    }
}
