package com.leetcode.Medium;

import java.util.*;

// 187. Repeated DNA Sequences
public class RepeatedDNASequences {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length() - 9; i++) {
            String subStr = s.substring(i, i + 10);
            map.put(subStr, map.getOrDefault(subStr, 0) + 1);
        }
        List<String> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= 2)
                result.add((entry.getKey()));
        }

        return result;
    }
}
