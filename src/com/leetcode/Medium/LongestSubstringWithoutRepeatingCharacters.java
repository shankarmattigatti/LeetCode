package com.leetcode.Medium;

// 3. Longest Substring Without Repeating Characters
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String str) {
        int n = str.length();
        if (n == 0)
            return 0;
        int cur_len = 1; // length of current substring
        int max_len = 1; // result
        int prev_index; // previous index
        int i;
        int[] visited = new int[256];

        for (i = 0; i < 256; i++)
            visited[i] = -1;

        visited[str.charAt(0)] = 0;

        for (i = 1; i < n; i++) {
            prev_index = visited[str.charAt(i)];

            if (prev_index == -1 || i - cur_len > prev_index)
                cur_len++;
            else {
                if (cur_len > max_len)
                    max_len = cur_len;

                cur_len = i - prev_index;
            }
            visited[str.charAt(i)] = i;
        }

        if (cur_len > max_len)
            max_len = cur_len;

        return max_len;
    }
}
