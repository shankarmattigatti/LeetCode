package com.leetcode.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 5280. Group the People Given the Group Size They Belong To
public class GroupThePeopleGivenTheGroupSizeTheyBelongTo {
    static <T> List<List<T>> chopped(List<T> list, final int L) {
        List<List<T>> parts = new ArrayList<>();
        final int N = list.size();
        for (int i = 0; i < N; i += L) {
            parts.add(new ArrayList<>(
                    list.subList(i, Math.min(N, i + L)))
            );
        }
        return parts;
    }

    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> lists = new ArrayList<>();
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < groupSizes.length; i++) {
            if (hashMap.containsKey(groupSizes[i])) {
                List<Integer> ls = hashMap.get(groupSizes[i]);
                ls.add(i);
            } else {
                List<Integer> ls = new ArrayList<>();
                ls.add(i);
                hashMap.put(groupSizes[i], ls);
            }
        }

        for (Map.Entry<Integer, List<Integer>> entry : hashMap.entrySet()) {
            lists.addAll(chopped(entry.getValue(), entry.getKey()));
        }
        return lists;
    }
}
