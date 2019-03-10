package com.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

// 66. Plus One
public class PlusOne {

    public int[] plusOne(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int k = 1;
        for (int i = digits.length - 1; i >= 0 || k > 0; --i) {
            list.add(0, (i >= 0 ? digits[i] + k : k) % 10);
            k = (i >= 0 ? digits[i] + k : k) / 10;
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
