package com.leetcode.Medium;

import java.util.*;

// 503. Next Greater Element II
public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i % n]) {
                stack.pop();
            }

            if (stack.isEmpty())
                res[i % n] = -1;
            else
                res[i % n] = nums[stack.peek()];

            stack.push(i % n);
        }

        return res;
    }
}
