package com.leetcode.Medium;

// 526. Beautiful Arrangement
public class BeautifulArrangement {
    private int result;

    public int countArrangement(int n) {
        result = 0;
        boolean[] visited = new boolean[n + 1];
        helper(visited, n, 1);
        return result;
    }

    private void helper(boolean[] visited, int n, int pos) {
        if(pos == n + 1) {
            result++;
        } else {
            for(int i = 1; i <= n; i++) {
                if(!visited[i] && (pos % i == 0 || i % pos == 0)) {
                    visited[i] = true;
                    helper(visited, n, pos + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
