package com.leetcode.Hard;

import java.util.ArrayList;
import java.util.List;

// 381. Insert Delete GetRandom O(1) - Duplicates allowed
public class RandomizedCollection {
    private List<Integer> list;

    public RandomizedCollection() {
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (list.contains(val)) {
            list.add(val);
            return false;
        }

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
