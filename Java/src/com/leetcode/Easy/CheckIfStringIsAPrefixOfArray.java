package com.leetcode.Easy;

// 1961. Check If String Is a Prefix of Array
public class CheckIfStringIsAPrefixOfArray {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word);
            if (s.equals(sb.toString()))
                return true;
            if (!s.contains(sb.toString()))
                return false;
        }
        return false;
    }
}
