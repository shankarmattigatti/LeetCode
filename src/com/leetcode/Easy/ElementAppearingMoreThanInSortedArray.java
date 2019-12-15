package com.leetcode.Easy;

import java.util.HashMap;
import java.util.Map;

// 5126. Element Appearing More Than 25% In Sorted Array
public class ElementAppearingMoreThanInSortedArray {
    public int findSpecialInteger(int[] arr) {
        int num = (arr.length / 2) / 2;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : arr) {
            if (hashMap.containsKey(i)) {
                int val = hashMap.get(i);
                hashMap.put(i, ++val);
            } else {
                hashMap.put(i, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > num)
                return entry.getKey();
        }
        return -1;
    }
}
