package com.leetcode.Hard;

import java.util.*;

// 224. Basic Calculator
public class BasicCalculator {
    public int calculate(String s) {
        int val = 0, sign = 1;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '+':
                    stack.push(stack.pop() + sign * val);
                    val = 0;
                    sign = 1;
                    break;
                case '-':
                    stack.push(stack.pop() + sign * val);
                    val = 0;
                    sign = -1;
                    break;
                case '(':
                    stack.push(sign);
                    stack.push(0);
                    val = 0;
                    sign = 1;
                    break;
                case ')':
                    stack.push(stack.pop() + sign * val);
                    int expVal = stack.pop();
                    expVal *= stack.pop();
                    stack.push(stack.pop() + expVal);
                    val = 0;
                    sign = 1;
                    break;
                case ' ':
                    break;
                default:
                    val = val * 10 - '0' + s.charAt(i);
            }
        }
        return stack.peek() + val * sign;
    }
}
