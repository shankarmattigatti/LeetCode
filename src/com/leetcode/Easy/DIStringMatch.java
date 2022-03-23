package com.leetcode.Easy;

// 942. DI String Match
public class DIStringMatch {
    public int[] diStringMatch(String s) {
        int n = s.length(), left = 0, right = n;
        int[] result = new int[n + 1];
        for (int i = 0; i < n; i++) {
            result[i] = s.charAt(i) == 'I' ? left++ : right--;
        }
        result[n] = left;
        return result;
    }
}
