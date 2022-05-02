package com.leetcode.Easy;

// 1437. Check If All 1's Are at Least Length K Places Away
public class CheckIfAll1sAreAtLeastLengthKPlacesAway {
    public boolean kLengthApart(int[] nums, int k) {
        int count = 0, i = nums[0] == 1 ? 1 : 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                if (count < k)
                    return false;

                count = 0;
            } else {
                count++;
            }
            i++;
        }
        return true;
    }
}
