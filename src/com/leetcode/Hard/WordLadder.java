package com.leetcode.Hard;

import java.util.*;

// 127. Word Ladder
public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int noOfWords = 0;
        Queue<String> queue = new LinkedList<>();
        Set<String> words = new HashSet<>(wordList);

        queue.add(beginWord);
        words.remove(beginWord);

        while (!queue.isEmpty()) {
            noOfWords++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();

                if (endWord.equals(word))
                    return noOfWords;

                List<String> neighbors = getNeighbors(word);
                for (String neighbor : neighbors) {
                    if (words.contains(neighbor)) {
                        queue.add(neighbor);
                        words.remove(neighbor);
                    }
                }
            }
        }
        return 0;
    }

    private List<String> getNeighbors(String word) {
        List<String> neighbors = new ArrayList<>();
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char temp = chars[i];
            for (char ch = 'a'; ch <= 'z'; ch++) {
                chars[i] = ch;
                neighbors.add(String.valueOf(chars));
            }
            chars[i] = temp;
        }
        return neighbors;
    }
}
