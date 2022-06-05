package com.leetcode.Easy;

// 1103. Distribute Candies to People
public class DistributeCandiesToPeople {

    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        for (int i = 0; candies > 0; i++) {
            arr[i % num_people] += Math.min(candies, i + 1);
            candies -= i + 1;
        }
        return arr;
    }
}
