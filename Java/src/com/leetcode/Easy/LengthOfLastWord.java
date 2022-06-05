package com.leetcode.Easy;

// 58. Length Of Last Word
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        if (s.trim().isEmpty()) return 0;

        String[] str = s.split(" ");
        return str[str.length - 1].length();
    }

}
