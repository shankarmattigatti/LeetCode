package com.leetcode.Medium;

import java.util.ArrayList;
import java.util.List;

// 1291. Sequential Digits
public class SequentialDigits {
    public List<Integer> sequentialDigits(int low, int high) {
        int n = 10;
        String str = "123456789";
        List<Integer> list = new ArrayList<>();

        int lowLength = String.valueOf(low).length();
        int highLength = String.valueOf(high).length();

        for (int i = lowLength; i < highLength + 1; i++) {
            for (int j = 0; j < n - i; j++) {
                int num = Integer.parseInt(str.substring(j, j + i));
                if (num >= low & num <= high)
                    list.add(num);
            }
        }

        return list;
    }
}
