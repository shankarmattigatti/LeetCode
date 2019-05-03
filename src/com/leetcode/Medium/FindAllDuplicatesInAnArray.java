package com.leetcode.Medium;

import java.util.*;

// 442. Find All Duplicates in an Array
public class FindAllDuplicatesInAnArray {

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();

        for (int num : nums) {
            int index = Math.abs(num) - 1;
            if (nums[index] < 0)
                list.add(Math.abs(num));

            nums[index] *= -1;
        }

        return list;
    }
}
