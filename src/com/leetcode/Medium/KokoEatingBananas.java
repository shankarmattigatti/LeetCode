package com.leetcode.Medium;

// 875. Koko Eating Bananas
public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1000000000;
        while (left < right) {
            int mid = (left + right) / 2, total = 0;
            for (int pile : piles)
                total += (pile + mid - 1) / mid;

            if (total > h)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}
