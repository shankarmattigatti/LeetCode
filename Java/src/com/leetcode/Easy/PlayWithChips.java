package com.leetcode.Easy;

// 1217. Play with Chips
public class PlayWithChips {
    public int minCostToMoveChips(int[] chips) {
        int odd = 0, even = 0;
        for (int i : chips) {
            if (i % 2 == 0)
                even++;
            else
                odd++;
        }

        return Math.min(odd, even);
    }
}
