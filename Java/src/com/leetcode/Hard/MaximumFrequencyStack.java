package com.leetcode.Hard;

import java.util.*;

// 895. Maximum Frequency Stack
public class MaximumFrequencyStack {
    private int maxFreq;
    private Map<Integer, Integer> freqMap;
    private Map<Integer, Stack<Integer>> stackMap;

    public MaximumFrequencyStack() {
        maxFreq = 0;
        freqMap = new HashMap<>();
        stackMap = new HashMap<>();
    }

    public void push(int val) {
        int freq = freqMap.getOrDefault(val, 0) + 1;
        freqMap.put(val, freq);
        maxFreq = Math.max(maxFreq, freq);
        if (!stackMap.containsKey(freq))
            stackMap.put(freq, new Stack<>());

        stackMap.get(freq).add(val);
    }

    public int pop() {
        int val = stackMap.get(maxFreq).pop();
        freqMap.put(val, maxFreq - 1);
        if (stackMap.get(maxFreq).size() == 0)
            maxFreq--;

        return val;
    }
}
