package com.leetcode.Medium;

import java.util.*;

// 986. Interval List Intersections
public class IntervalListIntersections {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        List<int[]> intervals = new ArrayList<>();
        int i = 0, j = 0;
        while (i < A.length && j < B.length) {
            int start = Math.max(A[i][0], B[j][0]);
            int end = Math.min(A[i][1], B[j][1]);

            if (start <= end)
                intervals.add(new int[]{start, end});

            if (A[i][1] < B[j][1])
                i++;
            else
                j++;
        }
        return intervals.toArray(new int[intervals.size()][]);
    }
}
