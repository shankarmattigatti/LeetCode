package com.leetcode.Easy;

// 744. Find Smallest Letter Greater Than Target
public class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        int min = Integer.MAX_VALUE;
        char ch = target;
        for (char letter : letters) {
            if ((letter - target) < min && letter > target) {
                min = letter - target;
                ch = letter;
            }
        }
        return ch == target ? letters[0] : ch;
    }
}
