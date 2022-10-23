package com.leetcode.Medium;

import java.util.*;

// 77. Combinations
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        combine(1, n, k, new ArrayList<>(), result);

        return result;
    }

    private void combine(int start, int end, int k, List<Integer> list,
                         List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(list));
        } else {
            for (int i = start; i <= end; i++) {
                list.add(i);
                combine(i + 1, end, k - 1, list, result);
                list.remove(list.size() - 1);
            }
        }
    }
}
