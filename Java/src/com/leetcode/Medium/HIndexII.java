package com.leetcode.Medium;

// 275. H-Index II
public class HIndexII {
    public int hIndex(int[] citations) {
        int len = citations.length;
        if (len == 0) return 0;

        if (len == 1) return citations[0] == 0 ? 0 : 1;

        int i = 0, j = len - 1;
        while (i < j) {
            int m = i + (j - i + 1) / 2;
            if (citations[m] > len - m)
                j = m - 1;
            else
                i = m;
        }

        if (citations[j] > len - j) return len;

        return citations[j] == len - j ? len - j : len - j - 1;
    }
}
