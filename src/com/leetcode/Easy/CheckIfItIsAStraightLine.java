package com.leetcode.Easy;

// 1232. Check If It Is a Straight Line
public class CheckIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length < 3 || coordinates[0].length == 0)
            return false;

        int[] f = coordinates[0];
        int[] s = coordinates[1];

        for (int i = 2; i < coordinates.length; i++) {
            int[] curr = coordinates[i];

            if ((curr[0] - f[0]) * (s[1] - f[1]) != (curr[1] - f[1]) * (s[0] - f[0]))
                return false;
        }

        return true;
    }
}
