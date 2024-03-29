package com.leetcode.Medium;

import java.util.Arrays;
import java.util.Comparator;

// 452. Minimum Number of Arrows to Burst Balloons
public class MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0)
            return 0;

        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int arrowPos = points[0][1], arrowCnt = 1;
        for (int i = 1; i < points.length; i++) {
            if (arrowPos >= points[i][0]) {
                continue;
            }
            arrowCnt++;
            arrowPos = points[i][1];
        }
        return arrowCnt;
    }
}
