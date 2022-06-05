package com.leetcode.Easy;

// 496. Next Greater Element I
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int j = 0;
            while (j < nums2.length) {
                if (nums1[i] == nums2[j])
                    break;
                j++;
            }
            res[i] = findNextGreatestNum(nums2, j, nums1[i]);
        }
        return res;
    }

    private int findNextGreatestNum(int[] arr, int currentIndex, int target) {
        while (currentIndex < arr.length) {
            if (arr[currentIndex] > target)
                return arr[currentIndex];

            currentIndex++;
        }
        return -1;
    }
}
