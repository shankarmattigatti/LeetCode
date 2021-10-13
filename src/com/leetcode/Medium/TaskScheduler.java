package com.leetcode.Medium;

import java.util.Arrays;

// 621. Task Scheduler
public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        if (tasks == null || tasks.length == 0)
            return 0;

        int[] cnt = new int[26];
        for (char task : tasks)
            cnt[task - 'A']++;

        Arrays.sort(cnt);
        int max = cnt[25] - 1;
        int spaces = max * n;

        for (int i = 24; i >= 0; i--)
            spaces -= Math.min(max, cnt[i]);

        spaces = Math.max(0, spaces);
        return tasks.length + spaces;
    }
}
