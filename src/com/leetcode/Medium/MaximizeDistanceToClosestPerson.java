package com.leetcode.Medium;

// 849. Maximize Distance to Closest Person
public class MaximizeDistanceToClosestPerson {
    public int maxDistToClosest(int[] seats) {
        int res = 0, len = seats.length, last = -1;
        for (int i = 0; i < len; i++) {
            if (seats[i] == 1) {
                res = last < 0 ? i : Math.max(res, (i - last) / 2);
                last = i;
            }
        }
        return Math.max(res, len - last - 1);
    }
}
