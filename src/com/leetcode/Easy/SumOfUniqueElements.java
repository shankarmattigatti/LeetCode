package com.leetcode.Easy;

import java.util.*;

// 1748. Sum of Unique Elements
public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                sum += entry.getKey();
        }
        return sum;
    }
}
