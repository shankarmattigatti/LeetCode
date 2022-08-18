package com.leetcode.Medium;

import java.util.*;

// 424. Longest Repeating Character Replacement
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int winStart = 0, maxLength = 0, maxRepeatLetterCount = 0;
        Map<Character, Integer> letterFrequencyMap = new HashMap<>();

        for (int winEnd = 0; winEnd < s.length(); winEnd++) {
            char rightChar = s.charAt(winEnd);
            letterFrequencyMap.put(rightChar, letterFrequencyMap.getOrDefault(rightChar, 0) + 1);
            maxRepeatLetterCount = Math.max(maxRepeatLetterCount, letterFrequencyMap.get(rightChar));

            if (winEnd - winStart + 1 - maxRepeatLetterCount > k) {
                char leftChar = s.charAt(winStart);
                letterFrequencyMap.put(leftChar, letterFrequencyMap.get(leftChar) - 1);
                winStart++;
            }

            maxLength = Math.max(maxLength, winEnd - winStart + 1);
        }

        return maxLength;
    }
}
