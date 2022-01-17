package com.leetcode.Easy;

import java.util.*;

// 290. Word Pattern
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");
        if (arr.length != pattern.length())
            return false;

        Map<Character, String> map = new HashMap<Character, String>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (map.containsKey(ch)) {
                String val = map.get(ch);
                if (!val.equals(arr[i])) {
                    return false;
                }
            } else if (map.containsValue(arr[i])) {
                return false;
            }
            map.put(ch, arr[i]);
        }
        return true;
    }
}
