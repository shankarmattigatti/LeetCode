package com.leetcode.Easy;

// 1417. Reformat The String
public class ReformatTheString {
    public String reformat(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        StringBuilder alphabets = new StringBuilder();

        int countNumbers = 0, countAlphabets = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                countNumbers++;
                numbers.append(ch);
            } else {
                countAlphabets++;
                alphabets.append(ch);
            }
        }

        int i = 0, j = 0;
        if (Math.abs(countNumbers - countAlphabets) <= 1) {
            if (countNumbers > countAlphabets) {
                while (i < numbers.length() && j < alphabets.length()) {
                    result.append(numbers.charAt(i++));
                    result.append(alphabets.charAt(j++));
                }
                while (i < numbers.length())
                    result.append(numbers.charAt(i++));
            } else {
                while (i < numbers.length() && j < alphabets.length()) {
                    result.append(alphabets.charAt(j++));
                    result.append(numbers.charAt(i++));
                }
                while (j < alphabets.length())
                    result.append(alphabets.charAt(j++));
            }
        }

        return result.toString();
    }
}
