package com.leetcode.Medium;

import java.util.*;

// 1451. Rearrange Words in a Sentence
public class RearrangeWordsInASentence {
    public String arrangeWords(String text) {
        List<String> list = new ArrayList<>();
        String[] words = text.split(" ");
        list.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            boolean foundIndex = false;
            for (int j = 0; j < list.size(); j++) {
                if(words[i].length() < list.get(j).length()) {
                    list.add(j, words[i]);
                    foundIndex = true;
                    break;
                }
            }
            if(!foundIndex) {
                list.add(words[i]);
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if(i == 0) {
                String str = list.get(i);
                String cap = str.substring(0, 1).toUpperCase() + str.substring(1);
                res.append(cap).append(" ");
            } else if(i == list.size() - 1) {
                res.append(list.get(i).toLowerCase());
            } else {
                res.append(list.get(i).toLowerCase()).append(" ");
            }
        }
        return res.toString();
    }
}
