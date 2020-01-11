package com.leetcode.Easy;

import java.util.ArrayList;
import java.util.List;

// 5143. Decompress Run-Length Encoded List
public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            int a = nums[i];
            int b = nums[i + 1];
            for (int j = 0; j < a; j++) {
                list.add(b);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
