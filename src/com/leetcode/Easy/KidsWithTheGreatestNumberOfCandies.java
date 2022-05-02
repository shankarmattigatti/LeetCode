package com.leetcode.Easy;

import java.util.*;

// 1431. Kids With the Greatest Number of Candies
public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for (int candy : candies) {
            if (candy + extraCandies >= max)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }
}
