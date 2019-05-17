package com.leetcode.Hard;

import java.util.*;

// 315. Count of Smaller Numbers After Self
public class CountOfSmallerNumbersAfterSelf {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> list = new ArrayList<>();
        if (nums.length <= 0)
            return list;

        for (int i = 0; i < nums.length; i++) {
            int smallerElement = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[i])
                    smallerElement++;
            }
            list.add(smallerElement);
            smallerElement = 0;
        }

        return list;
    }
}
