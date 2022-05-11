package com.leetcode.Easy;

// 1732. Find the Highest Altitude
public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int max = 0, maxAlt = 0;
        for (int netGain : gain) {
            max += netGain;
            maxAlt = Math.max(maxAlt, max);
        }

        return maxAlt;
    }
}
