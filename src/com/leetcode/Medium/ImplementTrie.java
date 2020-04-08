package com.leetcode.Medium;

// 208. Implement Trie (Prefix Tree)
public class ImplementTrie {
    static final int ALPHABET_SIZE = 26;

    static class TrieNode {
        boolean isEndOfWord;

        TrieNode[] children = new TrieNode[ALPHABET_SIZE];

        TrieNode() {
            for (int i = 0; i < ALPHABET_SIZE; i++) {
                children[i] = null;
            }
            isEndOfWord = false;
        }
    }

    static TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public ImplementTrie() {
        root = new TrieNode();
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (node.children[index] == null)
                node.children[index] = new TrieNode();

            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (node.children[index] == null)
                return false;

            node = node.children[index];
        }
        return node != null && node.isEndOfWord;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (node.children[index] == null)
                return false;

            node = node.children[index];
        }
        return true;
    }
}
