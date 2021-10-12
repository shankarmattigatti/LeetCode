package com.leetcode.Medium;

// 200. Number of Islands
public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        int islands = 0;
        int rows = grid.length, cols = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    islands++;
                    mergeIslands(grid, i, j);
                }
            }
        }
        return islands;
    }

    private void mergeIslands(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
            return;

        grid[i][j] = '0';
        mergeIslands(grid, i + 1, j);
        mergeIslands(grid, i - 1, j);
        mergeIslands(grid, i, j + 1);
        mergeIslands(grid, i, j - 1);
    }
}
