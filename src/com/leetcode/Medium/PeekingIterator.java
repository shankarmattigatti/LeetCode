package com.leetcode.Medium;

import java.util.Iterator;

// 284. Peeking Iterator
public class PeekingIterator implements Iterator<Integer> {
    private Integer next;

    private boolean hasNext;

    private final Iterator<Integer> iterator;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.hasNext = true;
        this.iterator = iterator;
        updateIterator();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer res = next;
        updateIterator();
        return res;
    }

    @Override
    public boolean hasNext() {
        return hasNext;
    }

    private void updateIterator() {
        if (iterator.hasNext())
            next = iterator.next();
        else
            hasNext = false;
    }
}
