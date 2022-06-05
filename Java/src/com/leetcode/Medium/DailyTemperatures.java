package com.leetcode.Medium;

// 739. Daily Temperatures
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] T) {
        int[] arr = new int[T.length];

        for (int i = 0; i < T.length; i++) {
            int x = 0;
            boolean isFound = false;
            for (int j = i; j < T.length; j++) {
                if (T[j] > T[i]) {
                    isFound = true;
                    break;
                }
                x++;
            }
            arr[i] = !isFound ? 0 : x;
        }
        return arr;
    }
}
