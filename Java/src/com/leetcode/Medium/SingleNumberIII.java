package com.leetcode.Medium;

import java.util.*;

// 260. Single Number III
public class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer> ls = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ls.add(entry.getKey());
            }
        }
        return ls.stream().mapToInt(i -> i).toArray();
    }
}
