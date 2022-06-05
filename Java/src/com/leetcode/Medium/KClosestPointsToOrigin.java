package com.leetcode.Medium;

import java.util.PriorityQueue;

// 973. K Closest Points to Origin
public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> ((b[0] * b[0]) + (b[1] * b[1])) - ((a[0] * a[0]) + (a[1] * a[1])));
        for (int i = 0; i < k; i++) {
            maxHeap.add(points[i]);
        }

        for (int i = k; i < points.length; i++) {
            int[] point = maxHeap.peek();
            int dist1 = (point[0] * point[0]) + (point[1] * point[1]);
            int dist2 = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            if (dist2 < dist1) {
                maxHeap.poll();
                maxHeap.add(points[i]);
            }
        }
        int[][] result = new int[maxHeap.size()][2];
        for (int i = 0; i < result.length; i++) {
            result[i] = maxHeap.poll();
        }
        return result;
    }
}
