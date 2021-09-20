package com.leetcode.Easy;

// 2000. Reverse Prefix of Word
public class ReversePrefixOfWord {
    public String reversePrefix(String word, char ch) {
        StringBuilder result = new StringBuilder();
        int indexOf = word.indexOf(ch);
        for (int i = indexOf; i >= 0; i--) {
            result.append(word.charAt(i));
        }

        result.append(word.substring(indexOf + 1));
        return result.toString();
    }
}
