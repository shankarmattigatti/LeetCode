package com.leetcode.Medium;

import java.util.List;

class Trie {
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

    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

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

    public String search(String word) {
        TrieNode node = root;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';
            if (node.isEndOfWord || node.children[index] == null)
                break;

            node = node.children[index];
            int val = 'a' + index;
            sb.append((char) val);
        }
        return node.isEndOfWord ? sb.toString() : word;
    }

}

// 648. Replace Words
public class ReplaceWords {
    public String replaceWords(List<String> dict, String sentence) {
        Trie trie = new Trie();
        for (String str : dict) {
            trie.insert(str);
        }

        StringBuilder sb = new StringBuilder();
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                sb.append(trie.search(words[i]));
            else
                sb.append(trie.search(words[i])).append(" ");
        }

        return sb.toString();
    }
}
