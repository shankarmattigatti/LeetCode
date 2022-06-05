package com.leetcode.Easy;

// 1071. Greatest Common Divisor of Strings
public class GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) return gcdOfStrings(str2, str1);
        if (str2.isEmpty()) return str1;
        if (!str2.equals(str1.substring(0, str2.length()))) return "";
        return gcdOfStrings(str1.substring(str2.length()), str2);
    }
}
