package com.leetcode.Medium;

import java.util.*;

// 1352. Product of the Last K Numbers
public class ProductOfTheLastKNumbers {
    private List<Integer> list;

    public ProductOfTheLastKNumbers() {
        list = new ArrayList<>();
        list.add(1);
    }

    public void add(int num) {
        if (num > 0) {
            list.add(list.get(list.size() - 1) * num);
        } else {
            list = new ArrayList<>();
            list.add(1);
        }
    }

    public int getProduct(int k) {
        int n = list.size();
        return k < n ? list.get(n - 1) / list.get(n - k - 1) : 0;
    }
}
