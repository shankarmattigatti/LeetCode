package com.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

// 1389. Create Target Array in the Given Order
public class CreateTargetArrayInTheGivenOrder {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length && i < index.length; i++) {
            list.add(index[i], nums[i]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
