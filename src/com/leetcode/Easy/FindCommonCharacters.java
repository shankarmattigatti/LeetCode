package com.leetcode.Easy;

import java.util.*;

// 1002. Find Common Characters
public class FindCommonCharacters {

    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();

        int[] dict = new int[26];
        for (int i = 0; i < A[0].length(); i++) {
            dict[A[0].charAt(i) - 'a']++;
        }

        for (int i = 1; i < A.length; i++) {
            int[] curr = new int[26];

            for (int j = 0; j < A[i].length(); j++) {
                curr[A[i].charAt(j) - 'a']++;
            }

            for (int j = 0; j < 26; j++) {
                if (curr[j] < dict[j]) dict[j] = curr[j];
            }
        }

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < dict.length; j++) {
                list.add(Character.toString((char) ('a' + i)));
            }
        }

        return list;
    }
}
