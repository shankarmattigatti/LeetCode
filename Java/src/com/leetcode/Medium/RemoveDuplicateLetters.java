package com.leetcode.Medium;

// 316. Remove Duplicate Letters
public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int pos = 0;
        int[] cnt = new int[26];
        for (int i = 0; i < s.length(); i++)
            cnt[s.charAt(i) - 'a']++;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(pos)) pos = i;
            if (--cnt[s.charAt(i) - 'a'] == 0) break;
        }
        return s.length() == 0 ? "" : s.charAt(pos) + removeDuplicateLetters(s.substring(pos + 1).replaceAll("" + s.charAt(pos), ""));
    }
}
