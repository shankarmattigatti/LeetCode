package com.leetcode.Easy;

import java.util.*;

// 1614. Maximum Nesting Depth of the Parentheses
public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int maxDepth = 0;
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                stack.push(ch);

            if (ch == ')') {
                if (stack.peek() == '(') {
                    maxDepth = Math.max(stack.size(), maxDepth);
                    stack.pop();
                }
            }
        }
        return maxDepth;
    }
}
