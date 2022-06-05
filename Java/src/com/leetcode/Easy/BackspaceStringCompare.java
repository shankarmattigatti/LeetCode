package com.leetcode.Easy;

// 844. Backspace String Compare
public class BackspaceStringCompare {

    public boolean backspaceCompare(String S, String T) {
        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#' && s.length() != 0) {
                int j = s.length();
                s.deleteCharAt(--j);
            } else if (S.charAt(i) != '#') {
                s.append(S.charAt(i));
            }
        }

        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#' && t.length() != 0) {
                int j = t.length();
                t.deleteCharAt(--j);
            } else if (T.charAt(i) != '#') {
                t.append(T.charAt(i));
            }
        }
        return s.toString().equals(t.toString());
    }
}
