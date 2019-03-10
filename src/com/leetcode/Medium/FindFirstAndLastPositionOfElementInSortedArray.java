package com.leetcode.Medium;

// 34. Find First and Last Position of Element in Sorted Array
public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = findFirstIndex(nums, target);
        arr[0] = findLastIndex(nums, target);
        return arr;
    }

    public static int findFirstIndex(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

            if (nums[mid] == target)
                index = mid;
        }
        return index;
    }

    public static int findLastIndex(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

            if (nums[mid] == target)
                index = mid;
        }
        return index;
    }

}
