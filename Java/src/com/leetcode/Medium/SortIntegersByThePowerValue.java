package com.leetcode.Medium;

import java.util.*;

// 1387. Sort Integers by The Power Value
public class SortIntegersByThePowerValue {
    public int getKth(int lo, int hi, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = lo; i <= hi; i++) {
            int count = getNStepsPower(i);
            map.put(i, count);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue() != 0 ? a.getValue() - b.getValue() : a.getKey() - b.getKey());

        return list.get(--k).getKey();
    }

    private int getNStepsPower(int n) {
        int count = 0;
        while(n != 1) {
            if(n % 2 == 0)
                n /= 2;
            else
                n = 3 * n + 1;
            count++;
        }
        return count;
    }
}
