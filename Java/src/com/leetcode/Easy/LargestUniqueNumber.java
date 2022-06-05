package com.leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

// 1133. Largest Unique Number
public class LargestUniqueNumber {
    public int largestUniqueNumber(int[] A) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : A) {
            if (!hashMap.containsKey(i)) {
                hashMap.put(i, 1);
            } else {
                int val = hashMap.get(i);
                hashMap.put(i, ++val);
            }
        }

        int max = -1;
        for (Map.Entry<Integer, Integer> key : hashMap.entrySet()) {
            if (key.getValue() == 1 && key.getKey() > max) {
                max = key.getKey();
            }
        }
        return max;
    }
}
