package com.leetcode.Easy;

import java.util.*;

// 1331. Rank Transform of an Array
public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
        int[] result = Arrays.copyOf(arr, arr.length);
        Arrays.sort(result);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : result)
            map.putIfAbsent(a, map.size() + 1);

        for (int i = 0; i < arr.length; ++i)
            result[i] = map.get(arr[i]);

        return result;
    }
}
