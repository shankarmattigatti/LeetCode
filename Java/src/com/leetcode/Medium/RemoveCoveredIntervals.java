package com.leetcode.Medium;

import java.util.Arrays;
import java.util.Comparator;

// 1288. Remove Covered Intervals
public class RemoveCoveredIntervals {
    public int removeCoveredIntervals(int[][] intervals) {
        int res = 0, left = -1, right = -1;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        for (int[] interval : intervals) {
            if (interval[0] > left && interval[1] > right) {
                left = interval[0];
                res++;
            }
            right = Math.max(right, interval[1]);
        }
        return res;
    }
}
