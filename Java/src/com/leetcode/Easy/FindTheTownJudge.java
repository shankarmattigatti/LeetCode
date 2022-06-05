package com.leetcode.Easy;

// 997. Find the Town Judge
public class FindTheTownJudge {
    public int findJudge(int N, int[][] trust) {
        int[] cnt = new int[N];
        for (int[] t : trust) {
            cnt[t[0] - 1]--;
            cnt[t[1] - 1]++;
        }
        for (int i = 0; i < N; i++) {
            if (cnt[i] == N - 1)
                return i + 1;
        }
        return -1;
    }
}
