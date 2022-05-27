package com.leetcode.Medium;

import java.util.*;

// 150. Evaluate Reverse Polish Notation
public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                if (!stack.isEmpty()) {
                    int right = stack.pop();
                    int left = stack.pop();
                    switch (token) {
                        case "+":
                            stack.push(left + right);
                            break;
                        case "-":
                            stack.push(left - right);
                            break;
                        case "*":
                            stack.push(left * right);
                            break;
                        case "/":
                            stack.push(left / right);
                            break;
                    }
                }
            }
        }

        return stack.peek();
    }

    private boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
