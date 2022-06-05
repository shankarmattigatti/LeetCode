package com.leetcode.Medium;

import java.util.List;

// 524. Longest Word in Dictionary through Deleting
public class LongestWordInDictionaryThroughDeleting {
    public String findLongestWord(String s, List<String> d) {
        String longestWord = "";
        for (String w : d) {
            if (isSubsequence(s, w)) {
                if (w.length() > longestWord.length() || (w.length() == longestWord.length() && w.compareTo(longestWord) < 0))
                    longestWord = w;
            }
        }
        return longestWord;
    }

    private boolean isSubsequence(String a, String b) {
        int i = 0, j = 0;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i++) == b.charAt(j))
                j++;
        }

        return j == b.length();
    }
}
