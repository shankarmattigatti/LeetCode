package com.leetcode.Easy;

// 	344. Reverse String
public class ReverseString {

    public void reverseString(char[] s) {
        int left, right = s.length - 1;
        for (left = 0; left < right; left++, right--) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
        }
    }
}
