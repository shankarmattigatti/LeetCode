package com.leetcode.Medium;

// 134. Gas Station
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0, total = 0, sumRem = 0;
        for (int i = 0; i < gas.length; i++) {
            int rem = gas[i] - cost[i];
            if (sumRem >= 0) {
                sumRem += rem;
            } else {
                sumRem = rem;
                start = i;
            }
            total += rem;
        }

        return total >= 0 ? start : -1;
    }
}
