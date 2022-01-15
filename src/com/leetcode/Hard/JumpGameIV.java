package com.leetcode.Hard;

import java.util.*;

// 1345. Jump Game IV
public class JumpGameIV {
    public int minJumps(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.computeIfAbsent(arr[i], x -> new LinkedList<>()).add(i);
        }

        boolean[] visited = new boolean[arr.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        visited[0] = true;
        int step = 0;
        while (!queue.isEmpty()) {
            for (int size = queue.size(); size > 0; --size) {
                int i = queue.poll();
                if (i == arr.length - 1)
                    return step;

                List<Integer> next = map.get(arr[i]);
                next.add(i - 1);
                next.add(i + 1);
                for (int j : next) {
                    if (j >= 0 && j < arr.length && !visited[j]) {
                        visited[j] = true;
                        queue.offer(j);
                    }
                }
                next.clear();
            }
            step++;
        }
        return 0;
    }
}
