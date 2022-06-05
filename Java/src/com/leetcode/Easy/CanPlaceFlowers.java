package com.leetcode.Easy;

// 605. Can Place Flowers
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 1, res = 0;
        for (int j : flowerbed) {
            if (j == 0) {
                count++;
            } else {
                res += (count - 1) / 2;
                count = 0;
            }
        }
        if (count != 0)
            res += count / 2;

        return res >= n;
    }
}
