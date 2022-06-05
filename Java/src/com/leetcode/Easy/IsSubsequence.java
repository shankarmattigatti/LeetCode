package com.leetcode.Easy;

// 392. Is Subsequence
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;

        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j))
                i++;

            j++;
            if (i == s.length())
                return true;
        }
        return false;
    }
}
