package com.leetcode.Easy;

import java.util.*;

// 884. Uncommon Words from Two Sentences
public class UncommonWordsFromTwoSentences {

    public String[] uncommonFromSentences(String A, String B) {
        String[] a = A.split(" ");
        String[] b = B.split(" ");
        List<String> list = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String str : a) {
            if (hashMap.containsKey(str)) {
                int val = hashMap.get(str);
                hashMap.put(str, ++val);
            } else {
                hashMap.put(str, 1);
            }
        }
        for (String str : b) {
            if (hashMap.containsKey(str)) {
                int val = hashMap.get(str);
                hashMap.put(str, ++val);
            } else {
                hashMap.put(str, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }

        return list.toArray(new String[0]);
    }
}
