package com.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

// 380. Insert Delete GetRandom O(1)
public class RandomizedSet {

    private List<Integer> list;

    public RandomizedSet() {
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (list.contains(val))
            return false;

        list.add(val);
        return true;
    }

    public boolean remove(int val) {
        if (list.contains(val)) {
            list.remove((Integer) val);
            return true;
        }
        return false;
    }

    public int getRandom() {
        if (list.isEmpty())
            return -1;

        int random = (int) (Math.random() * (list.size()));
        return list.get(random);
    }
}
