package com.leetcode.Easy;

import java.util.*;

// 1460. Make Two Arrays Equal by Reversing Sub-arrays
public class MakeTwoArraysEqualByReversingSubArrays {
    public boolean canBeEqual(int[] target, int[] arr) {
        if (target.length != arr.length)
            return false;

        Arrays.sort(target);
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (target[i] != arr[i])
                return false;
        }
        return true;
    }
}
