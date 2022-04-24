package com.leetcode.Easy;

import java.util.*;

// 1394. Find Lucky Integer in an Array
public class FindLuckyIntegerInAnArray {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr)
            map.put(i, map.getOrDefault(i, 0) + 1);

        int luckyNum = -1;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (Objects.equals(entry.getKey(), entry.getValue()))
                luckyNum = Math.max(luckyNum, entry.getKey());
        }

        return luckyNum;
    }
}
