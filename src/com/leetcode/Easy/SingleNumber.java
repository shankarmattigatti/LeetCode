package com.leetcode.Easy;

import java.util.Arrays;

// 136. Single Number
public class SingleNumber {

    public int singleNumber(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i += 2) {
            if (arr[i] != arr[i - 1])
                return arr[i - 1];
        }
        return arr[arr.length - 1];
    }
}
