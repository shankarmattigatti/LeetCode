package com.leetcode.Easy;

// 28. Implement strStr()
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;

        return haystack.indexOf(needle);
    }
}
