package com.leetcode.Medium;

// 1390. Four Divisors
public class FourDivisors {
    public int sumFourDivisors(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = 0;
            for (int d = 2; d * d <= nums[i]; ++d) {
                if (nums[i] % d == 0) {
                    if (x == 0) {
                        x = d;
                    } else {
                        x = 0;
                        break;
                    }
                }
            }

            if (x > 0 && x != nums[i] / x) {
                result += 1 + nums[i] + x + nums[i] / x;
            }
        }
        return result;
    }
}
