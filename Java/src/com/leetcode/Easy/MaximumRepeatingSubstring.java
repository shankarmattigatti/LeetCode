package com.leetcode.Easy;

// 1668. Maximum Repeating Substring
public class MaximumRepeatingSubstring {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        while (sequence.contains(word.repeat(count)))
            ++count;

        return count - 1;
    }
}
