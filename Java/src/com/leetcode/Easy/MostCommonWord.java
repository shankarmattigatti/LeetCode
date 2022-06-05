package com.leetcode.Easy;

import java.util.*;

// 819. Most Common Word
public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        List<String> bannedWords = List.of(banned);
        String[] words = paragraph.replaceAll("\\W+", " ").toLowerCase().split("\\s+");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (!bannedWords.contains(word))
                map.put(word, map.getOrDefault(word, 0) + 1);
        }

        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
