package com.leetcode.Medium;

// 1016. Binary String With Substrings Representing 1 To N
public class BinaryStringWithSubstringsRepresenting1ToN {
    static boolean isSubstring(String S, String X) {
        int m = X.length();
        int n = S.length();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (S.charAt(i + j) != X.charAt(j))
                    break;
            }

            if (j == m)
                return true;
        }
        return false;
    }

    public boolean queryString(String S, int N) {
        for (int i = 1; i <= N; i++) {
            String X = Integer.toBinaryString(i);
            if (!isSubstring(S, X))
                return false;
        }
        return true;
    }
}
