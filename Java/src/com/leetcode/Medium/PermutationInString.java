package com.leetcode.Medium;

import java.util.*;

// 567. Permutation in String
public class PermutationInString {
    private static String sortString(String str) {
        char[] strChar = str.toCharArray();
        Arrays.sort(strChar);
        return String.valueOf(strChar);
    }

    public boolean checkInclusion(String s1, String s2) {
        String s1Str = sortString(s1);
        StringBuilder sb = new StringBuilder();
        for (char ch : s2.toCharArray()) {
            sb.append(ch);
            if (sb.length() == s1.length()) {
                String s2Str = sortString(sb.toString());
                if (s1Str.equals(s2Str))
                    return true;

                sb.deleteCharAt(0);
            }
        }
        return false;
    }
}
