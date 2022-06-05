package com.leetcode.Medium;

// 1283. Find the Smallest Divisor Given a Threshold
public class FindTheSmallestDivisorGivenAThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = (int) 1e6;
        while (left < right) {
            int mid = (left + right) / 2, sum = 0;
            for (int i : nums)
                sum += (i + mid - 1) / mid;

            if (sum > threshold)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}
