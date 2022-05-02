package com.leetcode.Easy;

// 1446. Consecutive Characters
public class ConsecutiveCharacters {
    public int maxPower(String s) {
        int max = 1, count = 1;
        char ch = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                ch = s.charAt(i);
                max = Math.max(max, count);
                count = 1;
            } else {
                count++;
            }
        }
        return Math.max(max, count);
    }
}
