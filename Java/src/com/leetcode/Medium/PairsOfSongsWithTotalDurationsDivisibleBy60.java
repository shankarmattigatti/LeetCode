package com.leetcode.Medium;

// 1010. Pairs of Songs With Total Durations Divisible by 60
public class PairsOfSongsWithTotalDurationsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        int res = 0;
        int[] arr = new int[60];
        for (int t : time) {
            res += arr[(600 - t) % 60];
            arr[t % 60] += 1;
        }
        return res;
    }
}
