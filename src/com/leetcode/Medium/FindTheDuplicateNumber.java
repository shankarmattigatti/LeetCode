package com.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

// 287. Find the Duplicate Number
public class FindTheDuplicateNumber {

    public int findDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num))
                return num;
            else
                list.add(num);
        }
        return 0;
    }
}
