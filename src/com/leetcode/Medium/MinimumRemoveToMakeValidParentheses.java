package com.leetcode.Medium;

import java.util.Stack;

// 1249. Minimum Remove to Make Valid Parentheses
public class MinimumRemoveToMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder res = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == ')') {
                if (!stack.isEmpty())
                    stack.pop();
                else
                    res.setCharAt(i, '*');
            }
        }

        while (!stack.isEmpty()) {
            res.setCharAt(stack.pop(), '*');
        }

        return res.toString().replaceAll("\\*", "");
    }
}
