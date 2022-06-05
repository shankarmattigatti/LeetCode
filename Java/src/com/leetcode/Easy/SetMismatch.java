package com.leetcode.Easy;

import java.util.*;

// 645. Set Mismatch
public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int sum = 0, dup = -1;
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            if (list.contains(num) && dup == -1) {
                dup = num;
            } else {
                list.add(num);
                sum += num;
            }
        }
        if (dup == -1) {
            return new int[]{};
        } else {
            int n = list.size();
            int expSum = (n + 1) * (n + 2) / 2;
            int miss = expSum - sum;
            return new int[]{dup, miss};
        }
    }
}
