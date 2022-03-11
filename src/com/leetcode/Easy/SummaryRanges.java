package com.leetcode.Easy;

import java.util.*;

// 228. Summary Ranges
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;

        if (nums.length == 1)
            res.add(nums[0] + "");

        int pre = nums[0], first = pre;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == pre + 1) {
                if (i == nums.length - 1)
                    res.add(first + "->" + nums[i]);
            } else {
                if (first == pre)
                    res.add(first + "");
                else
                    res.add(first + "->" + pre);

                if (i == nums.length - 1)
                    res.add(nums[i] + "");

                first = nums[i];
            }
            pre = nums[i];
        }

        return res;
    }
}
