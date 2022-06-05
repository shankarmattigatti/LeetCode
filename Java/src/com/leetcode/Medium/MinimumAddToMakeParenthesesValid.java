package com.leetcode.Medium;

import java.util.Stack;

// 921. Minimum Add to Make Parentheses Valid
public class MinimumAddToMakeParenthesesValid {
    public int minAddToMakeValid(String S) {
        Stack<Character> stack = new Stack<>();
        for (char ch : S.toCharArray()) {
            if (!stack.isEmpty()) {
                if (isMatchingPair(stack.peek(), ch))
                    stack.pop();
                else
                    stack.push(ch);
            } else {
                stack.push(ch);
            }
        }
        return stack.size();
    }

    private static boolean isMatchingPair(char character1, char character2) {
        return character1 == '(' && character2 == ')';
    }
}
