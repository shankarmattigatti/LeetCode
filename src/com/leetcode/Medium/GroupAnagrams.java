package com.leetcode.Medium;

import java.util.*;

// 49. Group Anagrams
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> lists = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] word = str.toCharArray();
            Arrays.sort(word);
            String w = new String(word);
            if (map.containsKey(w)) {
                List<String> ls = map.get(w);
                ls.add(str);
            } else {
                List<String> ls = new ArrayList<>();
                ls.add(str);
                map.put(w, ls);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            lists.add(entry.getValue());
        }
        return lists;
    }
}
