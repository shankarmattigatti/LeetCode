package com.leetcode.Easy;

import java.util.Arrays;

// 242. Valid Anagram
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        s = new String(s1);
        t = new String(t1);
        return s.equals(t);
    }
}
