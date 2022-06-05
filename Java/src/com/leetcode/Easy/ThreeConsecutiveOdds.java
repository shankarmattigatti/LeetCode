package com.leetcode.Easy;

// 1550. Three Consecutive Odds
public class ThreeConsecutiveOdds {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 != 0)
                count++;
            else
                count = 0;

            if (count == 3)
                return true;
        }
        return false;
    }
}
