package com.leetcode.Medium;

// 1804. Implement Trie II (Prefix Tree)
public class ImplementTrieII {
    static class TrieNode {
        private final int N = 26;
        public int count, countEnd;
        public TrieNode[] children;

        public TrieNode() {
            count = 0;
            countEnd = 0;
            children = new TrieNode[N];
        }
    }

    private final TrieNode root;

    public ImplementTrieII() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (curr.children[index] == null)
                curr.children[index] = new TrieNode();

            curr = curr.children[index];
            curr.count++;
        }
        curr.countEnd++;
    }

    public int countWordsEqualTo(String word) {
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (curr.children[index] == null)
                return 0;

            curr = curr.children[index];
        }
        return curr.countEnd;
    }

    public int countWordsStartingWith(String prefix) {
        TrieNode curr = root;
        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';
            if (curr.children[index] == null)
                return 0;

            curr = curr.children[index];
        }
        return curr.count;
    }

    public void erase(String word) {
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (curr.children[index] == null)
                return;

            curr = curr.children[index];
            curr.count--;
        }
        curr.countEnd--;
    }
}
