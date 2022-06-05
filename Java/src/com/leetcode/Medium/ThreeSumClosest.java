package com.leetcode.Medium;

import java.util.*;

// 16. 3Sum Closest
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null || nums.length < 2)
            return -1;

        Arrays.sort(nums);
        int smallestDiff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1, high = nums.length - 1;
            while (low < high) {
                int diff = target - nums[i] - nums[low] - nums[high];
                if (diff == 0)
                    return target - diff;

                if (Math.abs(diff) < Math.abs(smallestDiff) || (Math.abs(diff) == Math.abs(smallestDiff) && diff > smallestDiff))
                    smallestDiff = diff;

                if (diff > 0)
                    low++;
                else
                    high--;
            }
        }
        return target - smallestDiff;
    }
}
