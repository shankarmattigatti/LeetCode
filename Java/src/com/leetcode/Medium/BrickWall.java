package com.leetcode.Medium;

import java.util.*;

// 554. Brick Wall
public class BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        int rows = wall.size(), maxBricks = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> row : wall) {
            int idx = 0;
            for (int i = 0; i < row.size() - 1; i++) {
                idx += row.get(i);
                map.put(idx, map.getOrDefault(idx, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet())
            maxBricks = Math.max(maxBricks, entry.getValue());

        return rows - maxBricks;
    }
}
