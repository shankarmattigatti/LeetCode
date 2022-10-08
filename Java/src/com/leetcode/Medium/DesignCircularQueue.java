package com.leetcode.Medium;

// 622. Design Circular Queue
public class DesignCircularQueue {
    private final int[] items;
    private final int size;
    private int front, rear;

    public DesignCircularQueue(int k) {
        items = new int[k];
        front = -1;
        rear = -1;
        size = k;
    }

    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        } else {
            if (front == -1)
                front = 0;

            rear = (rear + 1) % size;
            items[rear] = value;
            return true;
        }
    }

    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        } else {
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front = (front + 1) % size;
            }
            return true;
        }
    }

    public int Front() {
        if (isEmpty())
            return -1;

        return items[front];
    }

    public int Rear() {
        if (isEmpty())
            return -1;

        return items[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        if (front == 0 && rear == size - 1)
            return true;
        return front == rear + 1;
    }
}
