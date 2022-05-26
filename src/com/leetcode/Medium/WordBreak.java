package com.leetcode.Medium;

import java.util.*;

// 139. Word Break
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Queue<Integer> queue = new LinkedList<>();
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] visited = new boolean[s.length()];
        queue.add(0);

        while (!queue.isEmpty()) {
            int i = queue.poll();
            if (visited[i]) continue;

            for (int j = i + 1; j <= s.length(); j++) {
                if (wordDictSet.contains(s.substring(i, j))) {
                    if (j == s.length())
                        return true;

                    queue.add(j);
                }
            }
            visited[i] = true;
        }

        return false;
    }
}
