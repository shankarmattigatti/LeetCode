package com.leetcode.Easy;

import java.util.*;

// 961. N-Repeated Element in Size 2N Array
public class NRepeatedElementInSize2NArray {

    public int repeatedNTimes(int[] A) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : A) {
            if (hashMap.containsKey(i)) {
                int val = hashMap.get(i);
                hashMap.put(i, ++val);
            } else {
                hashMap.put(i, 1);
            }
        }
        int num = 0, maxR = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > maxR) {
                maxR = entry.getValue();
                num = entry.getKey();
            }
        }
        return num;
    }
}
