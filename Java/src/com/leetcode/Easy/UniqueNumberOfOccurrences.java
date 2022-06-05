package com.leetcode.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 5205. Unique Number of Occurrences
public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : arr) {
            if (hashMap.containsKey(i)) {
                int val = hashMap.get(i);
                hashMap.put(i, ++val);
            } else {
                hashMap.put(i, 1);
            }
        }

        List<Integer> ls = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (ls.contains(entry.getValue()))
                return false;
            else
                ls.add(entry.getValue());
        }
        return true;
    }
}
