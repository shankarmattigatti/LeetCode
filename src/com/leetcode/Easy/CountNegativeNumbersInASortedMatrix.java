package com.leetcode.Easy;

// 5340. Count Negative Numbers in a Sorted Matrix
public class CountNegativeNumbersInASortedMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0)
                    count++;
            }
        }
        return count;
    }
}
