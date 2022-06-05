package com.leetcode.Easy;

// 1592. Rearrange Spaces Between Words
public class RearrangeSpacesBetweenWords {
    public String reorderSpaces(String text) {
        String[] words = text.trim().split("\\s+");
        int length = words.length;
        int spaces = text.chars().map(c -> c == ' ' ? 1 : 0).sum();
        int gap = length <= 1 ? 0 : spaces / (length - 1);
        int trailingSpaces = gap == 0 ? spaces : spaces % (length - 1);
        return String.join(" ".repeat(gap), words) + " ".repeat(trailingSpaces);
    }
}
