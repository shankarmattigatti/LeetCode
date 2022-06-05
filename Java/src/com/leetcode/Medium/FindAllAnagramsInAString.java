package com.leetcode.Medium;

import java.util.*;

// 438. Find All Anagrams in a String
public class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String s, String p) {
        int[] map = new int[26];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < p.length(); i++)
            map[p.charAt(i) - 'a']++;

        int winStart = 0, winEnd = 0;
        while (winEnd < s.length()) {
            if (map[s.charAt(winEnd) - 'a'] > 0) {
                map[s.charAt(winEnd++) - 'a']--;
                if (winEnd - winStart == p.length())
                    result.add(winStart);
            } else if (winStart == winEnd) {
                winStart++;
                winEnd++;
            } else {
                map[s.charAt(winStart++) - 'a']++;
            }
        }
        return result;
    }
}
