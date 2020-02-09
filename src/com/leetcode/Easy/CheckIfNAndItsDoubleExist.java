package com.leetcode.Easy;

// 5332. Check If N and Its Double Exist
public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i] * 2;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == n && i != j)
                    return true;
            }
        }
        return false;
    }
}
