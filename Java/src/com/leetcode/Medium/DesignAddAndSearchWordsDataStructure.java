package com.leetcode.Medium;

import java.util.*;

// 211. Design Add and Search Words Data Structure
public class DesignAddAndSearchWordsDataStructure {
    static class TrieNode {
        char ch;
        boolean isEndOfWord;
        Map<Character, TrieNode> children = new HashMap<>();

        public TrieNode() {
        }

        public TrieNode(char ch) {
            this.ch = ch;
        }
    }

    private final TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public DesignAddAndSearchWordsDataStructure() {
        root = new TrieNode();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord(String word) {
        Map<Character, TrieNode> children = root.children;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            TrieNode node = null;
            if (children.containsKey(ch)) {
                node = children.get(ch);
            } else {
                node = new TrieNode(ch);
                children.put(ch, node);
            }

            children = node.children;

            if (i == word.length() - 1) {
                node.isEndOfWord = true;
            }
        }
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search(String word) {
        return dfsSearch(root.children, word, 0);
    }

    private boolean dfsSearch(Map<Character, TrieNode> children, String word, int start) {
        if (start == word.length()) {
            return children.size() == 0;
        }

        char ch = word.charAt(start);
        if (children.containsKey(ch)) {
            if (start == word.length() - 1 && children.get(ch).isEndOfWord)
                return true;

            return dfsSearch(children.get(ch).children, word, start + 1);
        } else if (ch == '.') {
            boolean res = false;
            for (Map.Entry<Character, TrieNode> child : children.entrySet()) {
                if (start == word.length() - 1 && child.getValue().isEndOfWord)
                    return true;

                if (dfsSearch(child.getValue().children, word, start + 1))
                    res = true;
            }

            return res;
        } else {
            return false;
        }
    }
}
