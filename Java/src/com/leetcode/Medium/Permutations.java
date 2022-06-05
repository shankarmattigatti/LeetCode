package com.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

// 46. Permutations
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length)
            list.add(new ArrayList<>(temp));
        else {
            for (int num : nums) {
                if (temp.contains(num))
                    continue;
                temp.add(num);
                backtrack(list, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
