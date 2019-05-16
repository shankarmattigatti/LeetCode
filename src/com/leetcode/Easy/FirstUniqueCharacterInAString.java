package com.leetcode.Easy;

import java.util.HashMap;

// 387. First Unique Character in a String
public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (Character c : s.toCharArray()) {
            if (hashMap.containsKey(c)) {
                int val = hashMap.get(c);
                hashMap.put(c, ++val);
            } else {
                hashMap.put(c, 1);
            }
        }

        for (int i = 0; i < s.toCharArray().length; i++) {
            int val = hashMap.get(s.charAt(i));
            if (val == 1)
                return i;
        }
        return -1;
    }
}
