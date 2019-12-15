package com.leetcode.Medium;

import java.util.LinkedList;
import java.util.Queue;

// 1286. Iterator for Combination
public class IteratorForCombination {
    private Queue<String> queue;

    private void combinationUtil(char[] arr, char[] data, int start,
                                 int end, int index, int k) {
        if (index == k) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < k; i++) {
                sb.append(data[i]);
            }
            queue.add(sb.toString());
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= k - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, k);
        }
    }

    public IteratorForCombination(String characters, int combinationLength) {
        queue = new LinkedList<>();
        int n = characters.length();
        char[] data = new char[combinationLength];
        char[] arr = characters.toCharArray();
        combinationUtil(arr, data, 0, n - 1, 0, combinationLength);
    }

    public String next() {
        return queue.poll();
    }

    public boolean hasNext() {
        return !queue.isEmpty();
    }

}
