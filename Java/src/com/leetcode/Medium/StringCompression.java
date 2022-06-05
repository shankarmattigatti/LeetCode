package com.leetcode.Medium;

// 443. String Compression
public class StringCompression {
    public int compress(char[] chars) {
        if (chars.length < 2) return chars.length;

        int count = 1;
        char prev = chars[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < chars.length; i++) {
            if (prev == chars[i]) {
                count++;
            } else {
                sb.append(prev);
                if (count > 1) sb.append(count);

                prev = chars[i];
                count = 1;
            }
        }
        sb.append(prev);
        if (count > 1) sb.append(count);
        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }
        return sb.length();
    }
}
