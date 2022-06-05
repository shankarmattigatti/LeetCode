package com.leetcode.Easy;

// 1967. Number of Strings That Appear as Substrings in Word
public class NumberOfStringsThatAppearAsSubstringsInWord {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String pattern : patterns) {
            if (word.contains(pattern))
                count++;
        }
        return count;
    }
}
