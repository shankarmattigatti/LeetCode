package com.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

// 66. Plus One
public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits.length == 0)
            return new int[0];

        List<Integer> res = new ArrayList<>();
        int i = digits.length - 1, j = 1;
        while (i >= 0) {
            int sum = digits[i--] + j;
            res.add(0, sum % 10);
            j = sum / 10;
        }
        if (j != 0)
            res.add(0, j);

        return res.stream().mapToInt(x -> x).toArray();
    }
}
