package com.leetcode.Medium;

// 5333. Minimum Number of Steps to Make Two Strings Anagram
public class MinimumNumberOfStepsToMakeTwoStringsAnagram {
    public int minSteps(String s, String t) {
        int count = 0;
        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++)
            charCount[s.charAt(i) - 'a']++;

        for (int i = 0; i < t.length(); i++) {
            if (charCount[t.charAt(i) - 'a']-- <= 0)
                count++;
        }

        return count;
    }
}
