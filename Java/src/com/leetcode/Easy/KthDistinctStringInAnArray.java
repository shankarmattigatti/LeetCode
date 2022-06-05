package com.leetcode.Easy;

import java.util.*;

// 2053. Kth Distinct String in an Array
public class KthDistinctStringInAnArray {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (String str : arr) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                k--;
                if (k == 0) return entry.getKey();
            }
        }

        return "";
    }
}
