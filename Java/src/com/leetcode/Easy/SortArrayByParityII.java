package com.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

// 922. Sort Array By Parity II
public class SortArrayByParityII {

    public int[] sortArrayByParityII(int[] A) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int value : A) {
            if (value % 2 == 0)
                even.add(value);
            else
                odd.add(value);
        }
        for (int i = 0, x = 0, y = 0; i < A.length; i++) {
            if (i % 2 == 0)
                A[i] = even.get(x++);
            else
                A[i] = odd.get(y++);
        }
        return A;
    }
}
