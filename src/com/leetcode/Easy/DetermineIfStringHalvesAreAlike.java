package com.leetcode.Easy;

// 1704. Determine if String Halves Are Alike
public class DetermineIfStringHalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        int len = s.length();
        String p1 = s.substring(0, len / 2);
        String p2 = s.substring(len / 2);

        return countVowels(p1.toLowerCase()) == countVowels(p2.toLowerCase());
    }

    private int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count++;
        }
        return count;
    }
}
