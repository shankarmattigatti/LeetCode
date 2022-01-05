package com.leetcode.Medium;

import java.util.*;

// 131. Palindrome Partitioning
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        if (s.length() == 0)
            return result;

        backTrack(result, new ArrayList<>(), s);
        return result;
    }

    public void backTrack(List<List<String>> res, List<String> temp, String s) {
        if (s.length() == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (isPalindrome(s.substring(0, i + 1))) {
                temp.add(s.substring(0, i + 1));
                backTrack(res, temp, s.substring(i + 1));
                temp.remove(temp.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
}
