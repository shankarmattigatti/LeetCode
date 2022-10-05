package com.leetcode.Medium;

import java.util.*;

// 560. Subarray Sum Equals K
public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0, currSum = 0;
        for (int num : nums) {
            currSum += num;
            if (currSum == k)
                count++;

            if (map.containsKey(currSum - k))
                count += map.get(currSum - k);

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}
