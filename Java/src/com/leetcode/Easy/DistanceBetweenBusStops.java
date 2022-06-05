package com.leetcode.Easy;

// 5181. Distance Between Bus Stops
public class DistanceBetweenBusStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int result = 0, sum = 0;
        for (int value : distance)
            sum += value;

        if (start < destination) {
            for (int i = start; i < destination; i++)
                result += distance[i];
        } else {
            for (int i = start - 1; i >= destination; i--)
                result += distance[i];
        }

        return Math.min(result, sum - result);
    }
}
