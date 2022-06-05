package com.leetcode.Medium;

import java.util.Stack;

// 856. Score of Parentheses
public class ScoreOfParentheses {
    public int scoreOfParentheses(String S) {
        int score = 0;
        Stack<Integer> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '(') {
                stack.push(score);
                score = 0;
            } else {
                score = stack.pop() + Math.max(score * 2, 1);
            }
        }
        return score;
    }
}
