package com.leetcode.Hard;

import java.util.Stack;

// 32. Longest Valid Parentheses
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        int res = 0, start = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    start = i + 1;
                } else {
                    stack.pop();
                    res = Math.max(res, stack.isEmpty() ? i - start + 1 : i - stack.peek());
                }
            }
        }
        return res;
    }
}
