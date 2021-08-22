package com.leetcode.Hard;

import java.util.*;

// 76. Minimum Window Substring
public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0)
            return "";

        Map<Character, Integer> charFreqMap = new HashMap<>();
        for (char ch : t.toCharArray()) {
            charFreqMap.put(ch, charFreqMap.getOrDefault(ch, 0) + 1);
        }

        int winStart = 0, matched = 0, minLength = s.length() + 1, subStrStart = 0;
        for (int winEnd = 0; winEnd < s.length(); winEnd++) {
            char rightChar = s.charAt(winEnd);
            if (charFreqMap.containsKey(rightChar)) {
                charFreqMap.put(rightChar, charFreqMap.get(rightChar) - 1);
                if (charFreqMap.get(rightChar) >= 0)
                    matched++;
            }

            while (matched == t.length()) {
                if (minLength > winEnd - winStart + 1) {
                    minLength = winEnd - winStart + 1;
                    subStrStart = winStart;
                }

                char leftChar = s.charAt(winStart++);
                if (charFreqMap.containsKey(leftChar)) {
                    if (charFreqMap.get(leftChar) == 0)
                        matched--;

                    charFreqMap.put(leftChar, charFreqMap.get(leftChar) + 1);
                }
            }
        }

        return minLength > s.length() ? "" : s.substring(subStrStart, subStrStart + minLength);
    }
}
