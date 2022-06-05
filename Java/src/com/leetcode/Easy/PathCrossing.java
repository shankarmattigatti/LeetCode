package com.leetcode.Easy;

import java.util.*;

// 1496. Path Crossing
public class PathCrossing {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        Set<String> set = new HashSet<>();
        set.add(x + "" + y);
        for (char ch : path.toCharArray()) {
            if (ch == 'N')
                y++;
            else if (ch == 'S')
                y--;
            else if (ch == 'E')
                x++;
            else
                x--;

            String str = x + "" + y;
            if (set.contains(str))
                return true;

            set.add(str);
        }
        return false;
    }
}
