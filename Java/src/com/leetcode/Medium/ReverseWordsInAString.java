package com.leetcode.Medium;

// 151. Reverse Words in a String
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        s = s.trim();
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            if (!str[i].trim().equals("")) {
                if (i == 0)
                    sb.append(str[i].trim());
                else
                    sb.append(str[i].trim()).append(" ");
            }
        }
        return sb.toString();
    }
}
