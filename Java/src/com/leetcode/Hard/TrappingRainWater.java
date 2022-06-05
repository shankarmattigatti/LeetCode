package com.leetcode.Hard;

// 42. Trapping Rain Water
public class TrappingRainWater {
    public int trap(int[] height) {
        int res = 0;
        int i = 0, j = height.length - 1;
        int maxLeft = 0, maxRight = 0;
        while(i <= j) {
            if(height[i] <= height[j]) {
                if(height[i] >= maxLeft)
                    maxLeft = height[i++];
                else
                    res += maxLeft - height[i++];
            } else {
                if(height[j] >= maxRight)
                    maxRight = height[j--];
                else
                    res += maxRight - height[j--];
            }
        }
        return res;
    }
}
