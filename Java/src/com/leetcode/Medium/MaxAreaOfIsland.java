package com.leetcode.Medium;

// 695. Max Area of Island
public class MaxAreaOfIsland {
    private int initialArea = 0;

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    initialArea = 0;
                    connectAreas(grid, i, j);
                    maxArea = Math.max(maxArea, initialArea);
                }
            }
        }
        return maxArea;
    }

    private void connectAreas(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0)
            return;

        initialArea++;
        grid[i][j] = 0;
        connectAreas(grid, i - 1, j);
        connectAreas(grid, i + 1, j);
        connectAreas(grid, i, j - 1);
        connectAreas(grid, i, j + 1);
    }
}
