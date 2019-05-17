package com.leetcode.Easy;

import java.util.*;

// 350. Intersection of Two Arrays II
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                j++;
            } else if (nums2[j] > nums1[i]) {
                i++;
            } else {
                list.add(nums1[i]);
                i++;
                j++;
            }
        }

        return list.stream().mapToInt(x -> x).toArray();
    }
}
