package com.leetcode.Easy;

import java.util.*;

// 933. Number of Recent Calls
public class NumberOfRecentCalls {
    private final Queue<Integer> queue;

    public NumberOfRecentCalls() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        queue.add(t);
        while (queue.size() > 0) {
            int last = queue.peek();
            if (t - last > 3000) {
                queue.poll();
            } else {
                break;
            }
        }
        return queue.size();
    }
}
