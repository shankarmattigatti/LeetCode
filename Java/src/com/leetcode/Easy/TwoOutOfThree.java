package com.leetcode.Easy;

import java.util.*;
import java.util.stream.Collectors;

// 2032. Two Out of Three
public class TwoOutOfThree {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        Set<Integer> set3 = Arrays.stream(nums3).boxed().collect(Collectors.toSet());
        int[] nums = new int[101];

        for (int i : set1) nums[i]++;

        for (int i : set2) nums[i]++;

        for (int i : set3) nums[i]++;

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 2)
                res.add(i);
        }
        return res;
    }
}
