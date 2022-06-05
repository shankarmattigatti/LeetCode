package com.leetcode.Easy;

// 1370. Increasing Decreasing String
public class IncreasingDecreasingString {
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        int[] charCount = new int[26];
        for (char ch : s.toCharArray()) {
            ++charCount[ch - 'a'];
        }

        while (sb.length() < s.length()) {
            add(charCount, sb, true);
            add(charCount, sb, false);
        }

        return sb.toString();
    }

    private void add(int[] charCount, StringBuilder sb, boolean asc) {
        for (int i = 0; i < 26; i++) {
            int j = asc ? i : 25 - i;
            if (charCount[j]-- > 0)
                sb.append((char) (j + 'a'));
        }
    }
}
