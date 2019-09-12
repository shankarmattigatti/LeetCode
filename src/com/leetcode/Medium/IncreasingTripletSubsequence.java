package com.leetcode.Medium;

// 334. Increasing Triplet Subsequence
public class IncreasingTripletSubsequence {

    public boolean IncreasingTriplet(int[] nums) {
        int n = nums.length;
        boolean found = false;
        int[] lis = new int[n];

        for (int i = 0; i < n; i++) {
            lis[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (lis[i] >= 3) {
                found = true;
                break;
            }
        }
        return found;
    }
}
