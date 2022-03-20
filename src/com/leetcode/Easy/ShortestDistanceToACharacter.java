package com.leetcode.Easy;

// 821. Shortest Distance to a Character
public class ShortestDistanceToACharacter {
    public int[] shortestToChar(String s, char c) {
        int n = s.length(), prev = Integer.MAX_VALUE;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c)
                prev = i;

            if (prev == Integer.MAX_VALUE)
                res[i] = prev;
            else
                res[i] = i - prev;
        }

        prev = Integer.MAX_VALUE;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c)
                prev = i;

            if (prev != Integer.MAX_VALUE)
                res[i] = Math.min(res[i], prev - i);
        }
        return res;
    }
}
