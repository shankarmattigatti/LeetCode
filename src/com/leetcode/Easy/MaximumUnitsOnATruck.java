package com.leetcode.Easy;

import java.util.*;

// 1710. Maximum Units on a Truck
public class MaximumUnitsOnATruck {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int max = 0;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        for (int i = 0; i < boxTypes.length && truckSize > 0; i++) {
            if (truckSize <= boxTypes[i][0]) {
                max += truckSize * boxTypes[i][1];
                truckSize = 0;
            } else {
                truckSize -= boxTypes[i][0];
                max += boxTypes[i][0] * boxTypes[i][1];
            }
        }
        return max;
    }
}
