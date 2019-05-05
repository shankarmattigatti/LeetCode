package com.leetcode.Easy;

import java.util.*;

// 728. Self Dividing Numbers
public class SelfDividingNumbers {
    static boolean isDivisible(int n) {
        int num = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || num % digit != 0)
                return false;
            n /= 10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isDivisible(i)) {
                list.add(i);
            }
        }
        return list;
    }
}
