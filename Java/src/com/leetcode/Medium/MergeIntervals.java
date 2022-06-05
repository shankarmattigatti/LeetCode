package com.leetcode.Medium;

import java.util.*;

// 56. Merge Intervals
public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1)
            return intervals;

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        int startInterval = intervals[0][0], endInterval = intervals[0][1];
        List<int[]> result = new ArrayList<>();
        for (int index = 1; index < intervals.length; index++) {
            if (endInterval >= intervals[index][0]) {
                endInterval = Math.max(endInterval, intervals[index][1]);
            } else {
                result.add(new int[]{startInterval, endInterval});

                startInterval = intervals[index][0];
                endInterval = intervals[index][1];
            }
        }
        result.add(new int[]{startInterval, endInterval});
        return result.toArray(new int[0][]);
    }
}
