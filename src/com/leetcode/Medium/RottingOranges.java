package com.leetcode.Medium;

import java.util.*;

// 994. Rotting Oranges
public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int freshOranges = 0, minutes = 0;
        Queue<int[]> queue = new LinkedList<>();
        int rows = grid.length, cols = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }

        if (freshOranges == 0)
            return 0;

        int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!queue.isEmpty()) {
            minutes++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] points = queue.poll();
                for (int[] dir : dirs) {
                    int x = points[0] + dir[0];
                    int y = points[1] + dir[1];

                    if (x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 || grid[x][y] == 2)
                        continue;

                    grid[x][y] = 2;
                    queue.offer(new int[]{x, y});
                    freshOranges--;
                }
            }
        }
        return freshOranges == 0 ? minutes - 1 : -1;
    }
}
