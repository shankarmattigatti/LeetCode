package com.leetcode.Medium;

// 5. Longest Palindromic Substring
public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() <= 1)
            return s;

        String res = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            String str1 = getLongestPalindrome(s, i, i);
            if (str1.length() > res.length()) {
                res = str1;
            }

            String str2 = getLongestPalindrome(s, i, i + 1);
            if (str2.length() > res.length()) {
                res = str2;
            }
        }
        return res;
    }

    private String getLongestPalindrome(String str, int i, int j) {
        while (i >= 0 && j <= str.length() - 1 && str.charAt(i) == str.charAt(j)) {
            i--;
            j++;
        }
        return str.substring(i + 1, j);
    }
}
