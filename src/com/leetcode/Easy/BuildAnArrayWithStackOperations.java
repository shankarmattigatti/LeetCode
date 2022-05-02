package com.leetcode.Easy;

import java.util.*;

// 1441. Build an Array With Stack Operations
public class BuildAnArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();
        int i = 1, j = 0;
        while (i <= n) {
            if (j == target.length)
                break;

            if (i == target[j]) {
                result.add("Push");
                j++;
            } else {
                result.add("Push");
                result.add("Pop");
            }
            i++;
        }
        return result;
    }
}
