package com.leetcode.Easy;

// 345. Reverse Vowels of a String
public class ReverseVowelsOfAString {

    public String reverseVowels(String s) {
        String vowels = "AEIOUaeiou";
        StringBuilder sb = new StringBuilder();
        StringBuilder S = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (vowels.indexOf(s.charAt(i)) >= 0)
                sb.append(s.charAt(i));
        }

        for (int i = 0, j = sb.length() - 1; i < s.length() || j >= 0; i++) {
            if (vowels.indexOf(s.charAt(i)) >= 0) {
                S.append(sb.charAt(j));
                j--;
            } else {
                S.append(s.charAt(i));
            }
        }
        return S.toString();
    }
}
