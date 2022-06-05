package com.leetcode.Easy;

import java.util.HashSet;

// 804. Unique Morse Code Words
public class UniqueMorseCodeWords {

    public int uniqueMorseRepresentations(String[] words) {
        String[] d = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> set = new HashSet<>();
        for (String word : words) {
            StringBuilder code = new StringBuilder();
            for (char c : word.toCharArray()) code.append(d[c - 'a']);
            set.add(code.toString());
        }
        return set.size();
    }
}
