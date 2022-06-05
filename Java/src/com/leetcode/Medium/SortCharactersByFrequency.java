package com.leetcode.Medium;

import java.util.*;

// 451. Sort Characters By Frequency
public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        List<Map.Entry<Character, Integer>> listMap = new LinkedList<>(map.entrySet());
        listMap.sort((o1, o2) -> o2.getValue() - o1.getValue());
        for (Map.Entry<Character, Integer> entry : listMap) {
            int count = entry.getValue();
            while (count != 0) {
                sb.append(entry.getKey());
                count--;
            }
        }

        return sb.toString();
    }
}
