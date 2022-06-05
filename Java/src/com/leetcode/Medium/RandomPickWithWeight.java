package com.leetcode.Medium;

import java.util.Random;

// 528. Random Pick with Weight
public class RandomPickWithWeight {
    private int sum;

    private final int[] w;

    private final Random random;

    public RandomPickWithWeight(int[] w) {
        this.w = w;
        random = new Random();
        for (int i : w) {
            this.sum += i;
        }
    }

    public int pickIndex() {
        int rand = random.nextInt(sum) + 1, temp = 0;
        for (int i = 0; i < w.length; i++) {
            if (temp + w[i] >= rand) return i;
            temp += w[i];
        }
        return w.length - 1;
    }
}
