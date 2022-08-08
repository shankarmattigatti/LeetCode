package com.leetcode.Medium;

// 45. Jump Game II
public class JumpGameII {
    public int jump(int[] nums) {
        int jumps = 0, lastJump = 0, maxJump = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxJump = Math.max(maxJump, i + nums[i]);
            if (i == lastJump) {
                jumps++;
                lastJump = maxJump;
            }
        }
        return jumps;
    }
}
