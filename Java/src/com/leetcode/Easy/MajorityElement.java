package com.leetcode.Easy;

import java.util.HashMap;

// 169. Majority Element
public class MajorityElement {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int greater = nums.length / 2;
        for (int i : nums) {
            if (hashMap.containsKey(i)) {
                int n = hashMap.get(i);
                hashMap.put(i, ++n);
            } else {
                hashMap.put(i, 1);
            }
        }

        int ans = 0;
        for (HashMap.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > greater) {
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
