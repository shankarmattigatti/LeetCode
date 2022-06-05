package com.leetcode.Medium;

// 848. Shifting Letters
public class ShiftingLetters {
    public String shiftingLetters(String s, int[] shifts) {
        int shift = 0;
        char[] result = s.toCharArray();
        for (int i = result.length - 1; i >= 0; i--) {
            shift = (shift + shifts[i]) % 26;
            result[i] = (char) ((result[i] - 'a' + shift) % 26 + 'a');
        }

        return new String(result);
    }
}
