package com.leetcode.Medium;

import java.util.*;

// 216. Combination Sum III
public class CombinationSumIII {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> currList = new ArrayList<>();
        List<List<Integer>> combinations = new ArrayList<>();

        findCombinations(combinations, currList, k, 1, n);

        return combinations;
    }

    private void findCombinations(List<List<Integer>> combinations, List<Integer> currList, int k, int start, int sum) {
        if (sum < 0) return;

        if (sum == 0 && currList.size() == k) {
            combinations.add(new ArrayList<>(currList));
            return;
        }

        for (int i = start; i <= 9; i++) {
            currList.add(i);
            findCombinations(combinations, currList, k, i + 1, sum - i);
            currList.remove(currList.size() - 1);
        }
    }
}
