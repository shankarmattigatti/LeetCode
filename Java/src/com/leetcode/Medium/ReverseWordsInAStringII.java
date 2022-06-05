package com.leetcode.Medium;

// 186. Reverse Words in a String II
public class ReverseWordsInAStringII {
    public void reverseWords(char[] s) {
        reverse(s, 0, s.length - 1);

        reverseEachWord(s);
    }

    static void reverseEachWord(char[] s) {
        int start = 0, end = 0, n = s.length;
        while (start < n) {
            while (end < n && s[end] != ' ')
                ++end;

            reverse(s, start, end - 1);
            start = end + 1;
            ++end;
        }
    }

    static void reverse(char[] s, int left, int right) {
        while (left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
}
