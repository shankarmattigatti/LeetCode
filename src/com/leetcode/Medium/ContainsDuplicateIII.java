package com.leetcode.Medium;

import java.util.*;

// 220. Contains Duplicate III
public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length < 2 || k < 0 || t < 0)
            return false;

        TreeSet<Long> set = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {
            long curr = nums[i];

            long left = curr - t;
            long right = curr + t + 1;
            SortedSet<Long> sub = set.subSet(left, right);
            if (sub.size() > 0)
                return true;

            set.add(curr);

            if (i >= k)
                set.remove((long) nums[i - k]);
        }
        return false;
    }
}
