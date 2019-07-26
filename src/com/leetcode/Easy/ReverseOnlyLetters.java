package com.leetcode.Easy;

// 917. Reverse Only Letters
public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder();
        String s = S.replaceAll("\\P{L}+", "");
        for (int i = 0, j = s.length() - 1; i < S.length() || j >= 0; i++) {
            if (!Character.isAlphabetic(S.charAt(i))) {
                sb.append(S.charAt(i));
            } else {
                sb.append(s.charAt(j));
                j--;
            }
        }
        return sb.toString();
    }
}
