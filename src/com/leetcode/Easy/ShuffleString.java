package com.leetcode.Easy;

// 1528. Shuffle String
public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] word = new char[indices.length];
        for (int i = 0; i < indices.length; i++)
            word[indices[i]] = s.charAt(i);

        return String.valueOf(word);
    }
}
