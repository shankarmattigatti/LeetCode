package com.leetcode.Easy;

import java.util.*;

// 1608. Special Array With X Elements Greater Than or Equal X
public class SpecialArrayWithXElementsGreaterThanOrEqualX {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int n = nums.length - i;
            if ((n <= nums[i]) && ((i - 1 < 0) || (n > nums[i - 1])))
                return n;
        }

        return -1;
    }
}
