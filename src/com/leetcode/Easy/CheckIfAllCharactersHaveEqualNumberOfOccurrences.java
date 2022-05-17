package com.leetcode.Easy;

import java.util.*;

// 1941. Check if All Characters Have Equal Number of Occurrences
public class CheckIfAllCharactersHaveEqualNumberOfOccurrences {
    public boolean areOccurrencesEqual(String s) {
        int firstCharCount = 0;
        char firstChar = s.charAt(0);
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            if (firstChar == ch)
                firstCharCount++;

            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (firstCharCount != entry.getValue())
                return false;
        }
        return true;
    }
}
