package com.leetcode.Medium;

import java.util.*;

// 229. Majority Element II
public class MajorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length / 3;
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n)
                res.add(entry.getKey());
        }
        return res;
    }
}
