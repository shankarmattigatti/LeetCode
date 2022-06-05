package com.leetcode.Easy;

// 1217. Minimum Cost to Move Chips to The Same Position
public class MinimumCostToMoveChipsToTheSamePosition {
    public int minCostToMoveChips(int[] chips) {
        int odd = 0, even = 0;
        for(int i : chips) {
            if(i % 2 == 0)
                even++;
            else
                odd++;
        }

        return Math.min(odd, even);
    }
}
