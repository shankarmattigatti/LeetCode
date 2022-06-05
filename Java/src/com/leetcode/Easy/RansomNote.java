package com.leetcode.Easy;

import java.util.*;

// 383. Ransom Note
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> ransomMap = new HashMap<>();
        Map<Character, Integer> magazineMap = new HashMap<>();

        for (char ch : ransomNote.toCharArray())
            ransomMap.put(ch, ransomMap.getOrDefault(ch, 0) + 1);

        for (char ch : magazine.toCharArray())
            magazineMap.put(ch, magazineMap.getOrDefault(ch, 0) + 1);

        for (Map.Entry<Character, Integer> entry : ransomMap.entrySet()) {
            char key = entry.getKey();
            if (magazineMap.containsKey(key)) {
                if (magazineMap.get(key) < entry.getValue())
                    return false;
            } else {
                return false;
            }
        }

        return true;
    }
}
