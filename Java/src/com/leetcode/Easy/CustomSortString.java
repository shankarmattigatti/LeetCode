package com.leetcode.Easy;

// 791. Custom Sort String
public class CustomSortString {

    public String customSortString(String S, String T) {
        StringBuilder sb = new StringBuilder();
        for (char s : S.toCharArray()) {
            for (char t : T.toCharArray()) {
                if (t == s) sb.append(t);
            }
        }

        for (char t : T.toCharArray()) {
            if (S.indexOf(t) < 0)
                sb.append(t);
        }
        return sb.toString();
    }
}
