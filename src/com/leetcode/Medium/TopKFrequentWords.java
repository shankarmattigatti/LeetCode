package com.leetcode.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 692. Top K Frequent Words
public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> listMap = new ArrayList<>(map.entrySet());
        listMap.sort((a, b) -> b.getValue() - a.getValue() != 0 ? b.getValue() - a.getValue() : a.getKey().compareTo(b.getKey()));
        for (int i = 0; i < listMap.size() && k > 0; i++, k--) {
            list.add(listMap.get(i).getKey());
        }
        return list;
    }
}
