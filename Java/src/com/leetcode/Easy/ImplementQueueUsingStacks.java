package com.leetcode.Easy;

import java.util.Stack;

// 232. Implement Queue using Stacks
public class ImplementQueueUsingStacks {
    private int size;
    private final Stack<Integer> eq;
    private final Stack<Integer> dq;

    /**
     * Initialize your data structure here.
     */
    public ImplementQueueUsingStacks() {
        size = 0;
        eq = new Stack<>();
        dq = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        while (!dq.isEmpty()) {
            eq.push(dq.pop());
        }
        size++;
        eq.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        while (!eq.isEmpty()) {
            dq.push(eq.pop());
        }
        size--;
        return dq.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        while (!eq.isEmpty()) {
            dq.push(eq.pop());
        }
        int peek = dq.peek();
        while (!dq.isEmpty()) {
            eq.push(dq.pop());
        }
        return peek;
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return size == 0;
    }
}
