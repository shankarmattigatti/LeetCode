package com.leetcode.Easy;

// 53. Maximum Subarray
public class MaximumSubarray {
    static int maxCrossingSum(int[] arr, int l, int mid, int h) {
        int sum = 0;
        int leftSum = Integer.MIN_VALUE;
        for (int i = mid; i >= l; i--) {
            sum += arr[i];
            if (sum > leftSum)
                leftSum = sum;
        }

        sum = 0;
        int rightSum = Integer.MIN_VALUE;
        for (int i = mid + 1; i <= h; i++) {
            sum += arr[i];
            if (sum > rightSum)
                rightSum = sum;
        }

        return leftSum + rightSum;
    }

    static int maxSubArraySum(int[] arr, int l, int h) {
        if (l == h)
            return arr[l];

        int m = (l + h) / 2;

        return Math.max(Math.max(maxSubArraySum(arr, l, m),
                maxSubArraySum(arr, m + 1, h)),
                maxCrossingSum(arr, l, m, h));
    }

    public int maxSubArray(int[] nums) {
        return maxSubArraySum(nums, 0, nums.length - 1);
    }
}
