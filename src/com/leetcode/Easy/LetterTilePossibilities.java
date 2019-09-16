package com.leetcode.Easy;

// 1079. Letter Tile Possibilities
public class LetterTilePossibilities {
    public int numTilePossibilities(String tiles) {
        int[] count = new int[26];
        for (char ch : tiles.toCharArray())
            count[ch - 'A']++;

        return dfs(count);
    }

    private static int dfs(int[] arr) {
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] == 0)
                continue;

            sum++;
            arr[i]--;
            sum += dfs(arr);
            arr[i]++;
        }
        return sum;
    }
}
