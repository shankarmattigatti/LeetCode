package com.leetcode.Easy;

import java.util.*;

// 409. Longest Palindrome
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return 0;

        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                set.remove(ch);
                count++;
            } else {
                set.add(ch);
            }
        }

        return set.isEmpty() ? count * 2 : count * 2 + 1;
    }
}
