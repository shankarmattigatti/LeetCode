package com.leetcode.Easy;

// 1816. Truncate Sentence
public class TruncateSentence {
    public String truncateSentence(String s, int k) {
        String[] words = s.split(" ");
        if (k >= words.length)
            return s;

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < k; i++) {
            if (i == k - 1)
                res.append(words[i]);
            else
                res.append(words[i]).append(" ");
        }
        return res.toString();
    }
}
