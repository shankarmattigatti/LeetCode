package com.leetcode.Easy;

// 1455. Check If a Word Occurs As a Prefix of Any Word in a Sentence
public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(searchWord) == 0)
                return i + 1;
        }
        return -1;
    }
}
