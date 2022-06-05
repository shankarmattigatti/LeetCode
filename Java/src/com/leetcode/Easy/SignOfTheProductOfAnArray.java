package com.leetcode.Easy;

// 1822. Sign of the Product of an Array
public class SignOfTheProductOfAnArray {
    public int arraySign(int[] nums) {
        int counter = 0;
        for (int num : nums) {
            if (num == 0)
                return 0;

            if (num < 0)
                counter++;
        }
        return counter % 2 == 0 ? 1 : -1;
    }
}
