package com.leetcode.Medium;

// 2079. Watering Plants
public class WateringPlants {
    public int wateringPlants(int[] plants, int capacity) {
        int result = 0, currWater = capacity;
        for (int i = 0; i < plants.length; i++) {
            if (currWater >= plants[i]) {
                result++;
                currWater -= plants[i];
                continue;
            }
            currWater = capacity - plants[i];
            result++;
            result += (i * 2);
        }
        return result;
    }
}
