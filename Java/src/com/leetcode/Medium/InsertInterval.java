package com.leetcode.Medium;

import java.util.*;

// 57. Insert Interval
public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i = 0;
        List<List<Integer>> mergeIntervals = new ArrayList<>();

        while (i < intervals.length && intervals[i][1] < newInterval[0]) {
            List<Integer> interval = Arrays.asList(intervals[i][0], intervals[i][1]);
            mergeIntervals.add(interval);
            i++;
        }

        while (i < intervals.length && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        List<Integer> interval = Arrays.asList(newInterval[0], newInterval[1]);
        mergeIntervals.add(interval);

        while (i < intervals.length) {
            List<Integer> extInterval = Arrays.asList(intervals[i][0], intervals[i][1]);
            mergeIntervals.add(extInterval);
            i++;
        }

        int[][] matrix = new int[mergeIntervals.size()][2];
        for (int j = 0; j < mergeIntervals.size(); j++) {
            matrix[j][0] = mergeIntervals.get(j).get(0);
            matrix[j][1] = mergeIntervals.get(j).get(1);
        }

        return matrix;
    }
}
