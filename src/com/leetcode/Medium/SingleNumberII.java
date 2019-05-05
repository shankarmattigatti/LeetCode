package com.leetcode.Medium;

import java.util.*;

// 137. Single Number II
public class SingleNumberII {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                int val = hashMap.get(nums[i]);
                hashMap.put(nums[i], ++val);
            } else {
                hashMap.put(nums[i], 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
