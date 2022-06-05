package com.leetcode.Easy;

// 557. Reverse Words in a String III
public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                res.append(reverseWords(sb.toString()));
                res.append(ch);
                sb.setLength(0);
            } else {
                sb.append(ch);
            }
        }
        res.append(reverse(sb.toString()));
        return res.toString();
    }

    private String reverse(String word) {
        if (word.equals("")) return "";
        StringBuilder res = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            res.append(word.charAt(i));
        }
        return res.toString();
    }
}
