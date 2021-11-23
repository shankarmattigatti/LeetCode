package com.leetcode.Hard;

import java.util.*;

public class LargestComponentSizeByCommonFactor {
    int[] parent;

    int get(int x) {
        return parent[x] == x ? x : (parent[x] = get(parent[x]));
    }

    void add(int x, int y) {
        parent[get(x)] = parent[get(y)];
    }

    public int largestComponentSize(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(num, max);
        }

        parent = new int[max + 1];
        for (int i = 1; i <= max; ++i)
            parent[i] = i;

        for (int num : nums) {
            for (int j = (int) Math.sqrt(num); j >= 2; --j) {
                if (num % j == 0) {
                    add(num, j);
                    add(num, num / j);
                }
            }
        }
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int j = get(num);
            if (!map.containsKey(j))
                map.put(j, 1);
            else
                map.put(j, map.get(j) + 1);

            result = Math.max(result, map.get(j));
        }
        return result;
    }
}
