package com.leetcode.Easy;

// 796. Rotate String
public class RotateString {
    public boolean rotateString(String A, String B) {
        if (A.equals(B)) return true;

        for (int i = 0; i < A.length(); i++) {
            A = leftRotateByOne(A);
            if (A.equals(B))
                return true;
        }
        return false;
    }

    private static String leftRotateByOne(String a) {
        int i;
        char[] ch = a.toCharArray();
        char first = ch[0];
        for (i = 0; i < a.length() - 1; i++) {
            ch[i] = ch[i + 1];
        }
        ch[i] = first;

        return new String(ch);
    }
}
