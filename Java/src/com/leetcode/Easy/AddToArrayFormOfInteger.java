package com.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

// 989. Add to Array-Form of Integer
public class AddToArrayFormOfInteger {

    public List<Integer> addToArrayForm(int[] A, int K) {
        List list = new ArrayList<>();
        for (int i = A.length - 1; i >= 0 || K > 0; --i) {
            list.add(0, (i >= 0 ? A[i] + K : K) % 10);
            K = (i >= 0 ? A[i] + K : K) / 10;
        }
        return list;
    }
}
