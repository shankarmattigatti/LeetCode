package com.leetcode.Easy;

import java.util.Stack;

// 155. Min Stack 
public class MinStack {

    Stack<Integer> stack = new Stack<>();

    public MinStack() {

    }

    public void push(int x) {
        stack.push(x);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        int min = stack.peek();
        for (Integer num : stack) {
            if (num < min)
                min = num;
        }
        return min;
    }
}
