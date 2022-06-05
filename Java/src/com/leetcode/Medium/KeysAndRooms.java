package com.leetcode.Medium;

import java.util.*;

// 841. Keys and Rooms
public class KeysAndRooms {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> set = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        set.add(0);
        stack.add(0);
        while (!stack.isEmpty()) {
            List<Integer> keys = rooms.get(stack.pop());
            for (int key : keys) {
                if (!set.contains(key)) {
                    set.add(key);
                    stack.add(key);

                    if (rooms.size() == set.size())
                        return true;
                }
            }
        }

        return rooms.size() == set.size();
    }
}
