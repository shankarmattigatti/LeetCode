package com.leetcode.Medium;

import java.util.*;

// 274. H-Index
public class HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int result = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            int cnt = citations.length - i;
            if (citations[i] >= cnt)
                result = cnt;
            else
                break;
        }
        return result;
    }
}
