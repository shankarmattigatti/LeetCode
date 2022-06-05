package com.leetcode.Medium;

import java.util.Stack;

// 1381. Design a Stack With Increment Operation
public class DesignAStackWithIncrementOperation {
    private Stack<Integer> stack;
    private int size;

    public DesignAStackWithIncrementOperation(int maxSize) {
        stack = new Stack<>();
        size = maxSize;
    }

    public void push(int x) {
        if (stack.size() < size)
            stack.push(x);
    }

    public int pop() {
        if (stack.isEmpty())
            return -1;

        return stack.pop();
    }

    public void increment(int k, int val) {
        for (int i = 0; i < stack.size() && k > 0; i++, k--) {
            stack.set(i, stack.get(i) + val);
        }
    }
}
