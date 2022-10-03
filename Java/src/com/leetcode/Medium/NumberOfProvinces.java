package com.leetcode.Medium;

import java.util.*;

// 547. Number of Provinces
public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int[] visited = new int[isConnected.length];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < isConnected.length; i++) {
            if (visited[i] == 0) {
                queue.add(i);
                while (!queue.isEmpty()) {
                    int q = queue.poll();
                    visited[q] = 1;
                    for (int j = 0; j < isConnected.length; j++) {
                        if (isConnected[q][j] == 1 && visited[j] == 0)
                            queue.add(j);
                    }
                }
                count++;
            }
        }
        return count;
    }
}
