package com.leetcode.Easy;

// 1332. Remove Palindromic Subsequences
public class RemovePalindromicSubsequences {

    public int removePalindromeSub(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        String rev = new StringBuilder(s).reverse().toString();
        if (rev.equals(s)) {
            return 1;
        }

        return 2;
    }
}
