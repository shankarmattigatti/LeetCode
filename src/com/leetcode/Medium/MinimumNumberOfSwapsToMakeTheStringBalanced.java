package com.leetcode.Medium;

// 1963. Minimum Number of Swaps to Make the String Balanced
public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    public int minSwaps(String s) {
        int stackSize = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                stackSize++;
            } else {
                if (stackSize > 0)
                    stackSize--;
            }
        }

        return (stackSize + 1) / 2;
    }
}
