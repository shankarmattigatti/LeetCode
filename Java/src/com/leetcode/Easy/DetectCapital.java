package com.leetcode.Easy;

// 520. Detect Capital
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word == null)
            return false;

        int count = 0, len = word.length();
        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(word.charAt(i)))
                count++;
        }

        if (count == 1)
            return Character.isUpperCase(word.charAt(0));

        return count == 0 || count == len;
    }
}
