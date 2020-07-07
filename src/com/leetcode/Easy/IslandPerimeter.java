package com.leetcode.Easy;

// 463. Island Perimeter
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0, rows = grid.length, cols = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    perimeter += 4 - numOfNeighbours(grid, rows, cols, i, j);
            }
        }
        return perimeter;
    }

    private int numOfNeighbours(int[][] grid, int rows, int col, int i, int j) {
        int count = 0;

        if (i > 0 && grid[i - 1][j] == 1)
            count++;

        if (j > 0 && grid[i][j - 1] == 1)
            count++;

        if (i < rows - 1 && grid[i + 1][j] == 1)
            count++;

        if (j < col - 1 && grid[i][i + 1] == 1)
            count++;

        return count;
    }
}
