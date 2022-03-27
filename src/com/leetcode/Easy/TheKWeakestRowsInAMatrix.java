package com.leetcode.Easy;

import java.util.*;

// 1337. The K Weakest Rows in a Matrix
public class TheKWeakestRowsInAMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            map.put(i, sum);
        }

        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEachOrdered(x -> sortedMap.put(x.getKey(), x.getValue()));

        int i = 0;
        int[] res = new int[k];
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            if (i == k)
                break;
            res[i++] = entry.getKey();
        }

        return res;
    }
}
