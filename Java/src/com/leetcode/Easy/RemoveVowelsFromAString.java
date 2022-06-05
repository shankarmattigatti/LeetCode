package com.leetcode.Easy;

// 1119. Remove Vowels from a String
public class RemoveVowelsFromAString {

    public String removeVowels(String S) {
        StringBuilder sb = new StringBuilder();
        for (Character ch : S.toCharArray()) {
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
