package com.leetcode.Easy;

// 1176. Diet Plan Performance
public class DietPlanPerformance {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int points = 0;
        for (int i = 0; i < calories.length - k + 1; i++) {
            int sum = 0;
            for (int j = 0; j < k && j + i < calories.length; j++)
                sum += calories[i + j];

            if (sum < lower) points--;
            if (sum > upper) points++;
        }
        return points;
    }
}
