package com.leetcode.Easy;

// 1684. Count the Number of Consistent Strings
public class CountTheNumberOfConsistentStrings {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            if (containsDistinct(word, allowed))
                count++;
        }
        return count;
    }

    private boolean containsDistinct(String word, String allowed) {
        for (char ch : word.toCharArray()) {
            if (!allowed.contains(String.valueOf(ch)))
                return false;
        }
        return true;
    }
}
