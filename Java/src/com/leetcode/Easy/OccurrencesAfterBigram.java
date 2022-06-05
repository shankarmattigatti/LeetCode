package com.leetcode.Easy;

import java.util.*;

// 5083. Occurrences After Bigram
public class OccurrencesAfterBigram {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> list = new ArrayList<>();

        for (int i = 2; i < words.length; i++) {
            String firstOne = words[i - 2];
            String secondOne = words[i - 1];

            if (firstOne.compareTo(first) == 0 && secondOne.compareTo(second) == 0)
                list.add(words[i]);
        }

        return list.toArray(new String[0]);
    }
}
