package com.leetcode.Medium;

import java.util.*;

// 763. Partition Labels
public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        int[] words = new int[26];
        for (int i = 0; i < s.length(); i++) {
            words[s.charAt(i) - 'a']++;
        }

        Set<Character> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0, l = s.length(), counter = 0;
        while (j < l) {
            char c = s.charAt(j++);
            if (!set.contains(c)) {
                set.add(c);
                counter++;
            }
            words[c - 'a']--;
            if (words[c - 'a'] == 0) {
                counter--;
                set.remove(c);
            }
            if (counter == 0) {
                result.add(j - i);
                i = j;
            }
        }
        return result;
    }
}
