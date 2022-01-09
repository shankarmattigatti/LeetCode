package com.leetcode.Easy;

// 2129. Capitalize the Title
public class CapitalizeTheTitle {
    public String capitalizeTitle(String title) {
        String[] words = title.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (word.length() > 2) {
                String firstChar = word.substring(0, 1);
                String remainingChars = word.substring(1);

                word = firstChar.toUpperCase() + remainingChars.toLowerCase();
            } else {
                word = word.toLowerCase();
            }
            result.append(word).append(" ");
        }

        return result.toString().trim();
    }
}
