package com.leetcode.Medium;

// 1041. Robot Bounded In Circle
public class RobotBoundedInCircle {
    public boolean isRobotBounded(String instructions) {
        int i = 0, x = 0, y = 0;
        int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int j = 0; j < instructions.length(); j++) {
            if (instructions.charAt(j) == 'R') {
                i = (i + 1) % 4;
            } else if (instructions.charAt(j) == 'L') {
                i = (i + 3) % 4;
            } else {
                x += dirs[i][0];
                y += dirs[i][1];
            }
        }
        return x == 0 && y == 0 || i > 0;
    }
}
