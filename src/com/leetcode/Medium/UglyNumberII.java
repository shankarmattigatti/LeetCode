package com.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

// 264. Ugly Number II
public class UglyNumberII {
    public int nthUglyNumber(int n) {
        if (n <= 0)
            return 0;

        List<Integer> ls = new ArrayList<>();
        ls.add(1);

        int i = 0, j = 0, k = 0;
        while (ls.size() < n) {
            int m2 = ls.get(i) * 2;
            int m3 = ls.get(j) * 3;
            int m5 = ls.get(k) * 5;

            int min = Math.min(m2, Math.min(m3, m5));
            ls.add(min);

            if (min == m2)
                i++;

            if (min == m3)
                j++;

            if (min == m5)
                k++;
        }
        return ls.get(ls.size() - 1);
    }
}
