package com.leetcode.Easy;

// 189. Rotate Array
public class RotateArray {

    public void rotateByOne(int[] arr) {
        int i, temp = arr[arr.length - 1];
        for (i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[i] = temp;
    }

    public void rotate(int[] nums, int k) {
        for (int i = nums.length - 1; i >= (nums.length - k); i--) {
            rotateByOne(nums);
        }
    }
}
