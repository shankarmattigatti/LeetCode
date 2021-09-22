package com.leetcode.Medium;

import java.util.*;

// 90. Subsets II
public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());

        Arrays.sort(nums);
        int startIndex, endIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            startIndex = 0;
            if (i > 0 && nums[i] == nums[i - 1])
                startIndex = endIndex + 1;

            endIndex = result.size() - 1;
            for (int j = startIndex; j <= endIndex; j++) {
                List<Integer> set = new ArrayList<>(result.get(j));
                set.add(nums[i]);
                result.add(set);
            }
        }

        return result;
    }
}
