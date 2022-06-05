package com.leetcode.Easy;

// 1523. Count Odd Numbers in an Interval Range
public class CountOddNumbersInAnIntervalRange {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - (low / 2);
    }
}
