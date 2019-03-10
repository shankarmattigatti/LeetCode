package com.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

// 287. Find the Duplicate Number
public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i]))
                return nums[i];
            else
                list.add(nums[i]);
        }
        return 0;
    }
}
