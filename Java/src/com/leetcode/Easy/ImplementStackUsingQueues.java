package com.leetcode.Easy;

import java.util.*;

// 225. Implement Stack using Queues
public class ImplementStackUsingQueues {
    private final Queue<Integer> queue;

    /**
     * Initialize your data structure here.
     */
    public ImplementStackUsingQueues() {
        queue = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        queue.offer(x);
        int size = queue.size();
        while (size > 1) {
            queue.offer(queue.poll());
            size--;
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return queue.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return queue.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return queue.isEmpty();
    }
}
