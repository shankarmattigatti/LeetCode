package com.leetcode.Easy;

// 205. Isomorphic Strings
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        int[] s1 = new int[256];
        int[] t1 = new int[256];
        for (int i = 0; i < s.length(); i++) {
            if (s1[s.charAt(i)] != t1[t.charAt(i)])
                return false;

            s1[s.charAt(i)] = i + 1;
            t1[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
